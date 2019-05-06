package com.test.sdk.uimomo.model;

import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author: S
 * @date: 2018/12/5 13:48
 * @description:
 */
public interface TestModel {

//    @Headers("Content-Type: application/json")
//    @POST("auth")
//    Observable<String> login(@Body String user);

    @Headers("Content-Type: application/json")
    @POST("weixin/query")
    Observable<String> login(@Query("key") String key);
}
