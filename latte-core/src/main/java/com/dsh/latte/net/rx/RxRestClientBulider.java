package com.dsh.latte.net.rx;

import android.content.Context;

import com.dsh.latte.net.RestCreator;
import com.dsh.latte.ui.loader.LoaderStyle;

import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by Adam on 2018/3/19.
 */

public class RxRestClientBulider {

    private  String mUrl = null;
    private  static final Map<String,Object> PARAMS = RestCreator.getParams();
    private  RequestBody mBody= null;
    private  Context  mContext= null;
    private LoaderStyle mLoaderStyle= null;
    private File mFile = null;


    RxRestClientBulider(){
        //只允许同包的restClient去new它
    }

    public final RxRestClientBulider url (String url){
        this.mUrl = url;
        return this;
    }

    public final RxRestClientBulider params (WeakHashMap<String,Object> params){
        PARAMS.putAll(params);
        return this;
    }

    //重载
    public final RxRestClientBulider params (String key,Object value){
        PARAMS.put(key,value);
        return this;
    }

    public final RxRestClientBulider file (File file){
        this.mFile = file;
        return this;
    }

    public final RxRestClientBulider file (String file){
        this.mFile = new File(file);
        return this;
    }


    public final RxRestClientBulider raw (String raw){
        this.mBody = RequestBody.create(MediaType.parse("application/json;charset=UTF-8"),raw);
        return this;
    }




    public final RxRestClientBulider loader(Context context,LoaderStyle style){
        this.mContext = context;
        this.mLoaderStyle = style;
        return this;
    }

    public final RxRestClientBulider loader(Context context){
        this.mContext = context;
        this.mLoaderStyle = LoaderStyle.BallClipRotatePulseIndicator;
        return this;
    }

    public final RxRestClient build(){
        return new RxRestClient(mUrl,PARAMS,
                mBody,mFile,mContext,mLoaderStyle);
    }

}
