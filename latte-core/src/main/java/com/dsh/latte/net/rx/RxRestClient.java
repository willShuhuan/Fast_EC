package com.dsh.latte.net.rx;

import android.content.Context;

import com.dsh.latte.net.HttpMethod;
import com.dsh.latte.net.RestCreator;
import com.dsh.latte.ui.loader.LatteLoader;
import com.dsh.latte.ui.loader.LoaderStyle;

import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;

import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/**
 * Created by Adam on 2018/3/2.
 */

public class RxRestClient {

    private final String URL;
    private static WeakHashMap<String,Object> PARAMS = RestCreator.getParams();
    private final RequestBody BODY;
    private final LoaderStyle LOADER_STYLE;
    private final Context CONTEXT;
    private final File FILE;



    public RxRestClient(String url,
            Map<String, Object> params,
            RequestBody body,
            File file,
            Context context,
            LoaderStyle loaderStyle) {
        this.URL = url;
        PARAMS.putAll(params);
        this.BODY = body;
        this.FILE = file;
        this.CONTEXT = context;
        this.LOADER_STYLE = loaderStyle;
    }


    public static RxRestClientBulider bulider(){
        return new RxRestClientBulider();
    }

    private Observable<String> request(HttpMethod method){
        final RxRestService service = RestCreator.getRxRestService();
        Observable<String> observable = null;


        if (LOADER_STYLE!=null){
            LatteLoader.showLoading(CONTEXT,LOADER_STYLE);
        }

        switch (method) {
            case GET:
                observable = service.get(URL,PARAMS);
                break;
            case POST:
                observable = service.post(URL,PARAMS);
                break;
            case PUT:
                observable = service.put(URL,PARAMS);
                break;
            case DELETE:
                observable = service.delete(URL,PARAMS);
                break;
            case POST_RAW:
                observable = service.postRaw(URL,BODY);
                break;
            case PUT_RAW:
                observable = service.putRaw(URL,BODY);
                break;
            case UPLOAD://默认使用retrofit中的方法
                final RequestBody requestBody =
                        RequestBody.create(MediaType.parse(MultipartBody.FORM.toString()), FILE);
                final MultipartBody.Part body =
                        MultipartBody.Part.createFormData("file", FILE.getName(), requestBody);
                observable = RestCreator.getRxRestService().upload(URL, body);
                break;

        		default:
        			break;
        		}

        return observable;
    }



    public final Observable<String> get(){
        return request(HttpMethod.GET);
    }

    public final Observable<String> post(){
        if (BODY==null){
            return request(HttpMethod.POST);
        }else {
            if (PARAMS.isEmpty()){
                throw new RuntimeException("params must not be null!");
            }
            return request(HttpMethod.POST_RAW);
        }

    }

    public final Observable<String> put(){
        if (BODY==null){
            return request(HttpMethod.PUT);
        }else {
            if (PARAMS.isEmpty()){
                throw new RuntimeException("params must not be null!");
            }
            return request(HttpMethod.PUT_RAW);
        }
    }

    public final Observable<String> delete(){
        return request(HttpMethod.DELETE);
    }

    public final Observable<String> upload() {
        return request(HttpMethod.UPLOAD);
    }

    public final Observable<ResponseBody> download() {
        return RestCreator.getRxRestService().download(URL,PARAMS);

    }

}
