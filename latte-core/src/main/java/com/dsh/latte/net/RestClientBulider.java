package com.dsh.latte.net;

import com.dsh.latte.net.callback.IError;
import com.dsh.latte.net.callback.IFailure;
import com.dsh.latte.net.callback.IRequest;
import com.dsh.latte.net.callback.ISuccess;

import java.util.Map;
import java.util.WeakHashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by Adam on 2018/3/19.
 */

public class RestClientBulider {

    private  String mUrl;
    private  static final Map<String,Object> PARAMS = RestCreator.getParams();
    private  IRequest mIRequest;
    private  ISuccess mISuccess;
    private  IFailure mIFailure;
    private  IError mIError;
    private  RequestBody mBody;

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

    public final RestClient build(){
        return new RestClient(mUrl,PARAMS,mIRequest,mISuccess,mIFailure,mIError,mBody);
    }

}
