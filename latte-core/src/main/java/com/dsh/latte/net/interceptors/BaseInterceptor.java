package com.dsh.latte.net.interceptors;

import java.io.IOException;
import java.util.LinkedHashMap;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Adam on 2018/3/26.
 */

public abstract class BaseInterceptor implements Interceptor {


    //linkedhashmap相比于hashmap有序
    protected LinkedHashMap<String,String> getUrlParameters(Chain chain){
        final HttpUrl url = chain.request().url();
        int size = url.querySize();
        final LinkedHashMap<String,String> params = new LinkedHashMap<>();
        for (int i = 0; i < size; i++) {
            params.put(url.queryParameterName(i),url.queryParameterValue(i));
        }
        return params;
    }

    protected String getUrlParameters(Chain chain,String key){
        final Request request = chain.request();
        return request.url().queryParameter(key);
    }

    protected LinkedHashMap<String,String> getBodyparameters(Chain chain){
        final FormBody formbody = (FormBody) chain.request().body();
        final LinkedHashMap<String,String> params = new LinkedHashMap<>();
        int size = formbody.size();
        for (int i = 0; i < size; i++) {
            params.put(formbody.name(i),formbody.value(i));
        }
        return params;
    }

    protected String getBodyparameters(Chain chain,String key){

        return getBodyparameters(chain).get(key);
    }

}
