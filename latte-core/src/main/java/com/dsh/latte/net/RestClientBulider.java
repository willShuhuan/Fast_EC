package com.dsh.latte.net;

import android.content.Context;

import com.dsh.latte.net.callback.IError;
import com.dsh.latte.net.callback.IFailure;
import com.dsh.latte.net.callback.IRequest;
import com.dsh.latte.net.callback.ISuccess;
import com.dsh.latte.ui.LoaderStyle;

import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by Adam on 2018/3/19.
 */

public class RestClientBulider {

    private  String mUrl = null;
    private  static final Map<String,Object> PARAMS = RestCreator.getParams();
    private  IRequest mIRequest= null;
    private  ISuccess mISuccess= null;
    private  IFailure mIFailure= null;
    private  IError mIError= null;
    private  RequestBody mBody= null;
    private  Context  mContext= null;
    private LoaderStyle mLoaderStyle= null;
    private File mFile = null;
    //下载相关
    private String mDownloadDir = null;
    private String mExtension = null;
    private String mName = null;

    RestClientBulider(){
        //只允许同包的restClient去new它
    }

    public final RestClientBulider url (String url){
        this.mUrl = url;
        return this;
    }

    public final RestClientBulider params (WeakHashMap<String,Object> params){
        PARAMS.putAll(params);
        return this;
    }

    //重载
    public final RestClientBulider params (String key,Object value){
        PARAMS.put(key,value);
        return this;
    }

    public final RestClientBulider file (File file){
        this.mFile = file;
        return this;
    }

    public final RestClientBulider file (String file){
        this.mFile = new File(file);
        return this;
    }

    public final RestClientBulider name(String name) {
        this.mName = name;
        return this;
    }

    public final RestClientBulider dir(String dir) {
        this.mDownloadDir = dir;
        return this;
    }

    public final RestClientBulider extension(String extension) {
        this.mExtension = extension;
        return this;
    }

    public final RestClientBulider raw (String raw){
        this.mBody = RequestBody.create(MediaType.parse("application/json;charset=UTF-8"),raw);
        return this;
    }


    public final RestClientBulider success (ISuccess iSuccess){
        this.mISuccess = iSuccess;
        return this;
    }

    public final RestClientBulider onRequest (IRequest iRequest){
        this.mIRequest = iRequest;
        return this;
    }

    public final RestClientBulider failure (IFailure iFailure){
        this.mIFailure = iFailure;
        return this;
    }

    public final RestClientBulider error (IError iError){
        this.mIError = iError;
        return this;
    }

    public final RestClientBulider loader(Context context,LoaderStyle style){
        this.mContext = context;
        this.mLoaderStyle = style;
        return this;
    }

    public final RestClientBulider loader(Context context){
        this.mContext = context;
        this.mLoaderStyle = LoaderStyle.BallClipRotatePulseIndicator;
        return this;
    }

    public final RestClient build(){
        return new RestClient(mUrl,PARAMS,
                mDownloadDir, mExtension, mName,
                mIRequest,mISuccess,mIFailure,mIError,
                mBody,mFile,mContext,mLoaderStyle);
    }

}
