package com.test.sdk.uimomo.model;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * @author: S
 * @date: 2018/12/5 13:48
 * @description:
 */
public interface UserModel {

    @Headers("Content-Type: application/json")
    @POST("auth")
    Observable<String> login(@Body String user);

}
