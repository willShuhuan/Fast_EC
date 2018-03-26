package com.dsh.latte.net.rx;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by Adam on 2018/3/26.
 */

public interface RxRestService {
    @GET
    Observable<String> get(@Url String url,@QueryMap Map<String,Object> params);

    @FormUrlEncoded
    @POST
    Observable<String> post(@Url String url,@FieldMap Map<String,Object> params);

    @POST
    Observable<String> postRaw(@Url String url,@Body RequestBody body);

    @FormUrlEncoded
    @PUT
    Observable<String> put(@Url String url,@FieldMap Map<String,Object> params);

    @PUT
    Observable<String> putRaw(@Url String url,@Body RequestBody body);


    @DELETE
    Observable<String> delete(@Url String url,@QueryMap Map<String,Object> params);

    @Streaming//避免写入文件过大oom，一边下载一边写入文件
    @GET
    Observable<ResponseBody> download(@Url String url,@QueryMap Map<String,Object> params);

    @Multipart
    @POST
    Observable<String> upload(@Url String url, @Part MultipartBody.Part file);
}
