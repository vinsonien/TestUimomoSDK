package com.test.sdk.uimomo.api;


import com.test.sdk.uimomo.http.BaseAppApi;
import com.test.sdk.uimomo.model.UserModel;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * @author: S
 * @date: 2018/12/5 13:48
 * @description:
 */
public class UserApi extends BaseAppApi {
    private String user;

    public UserApi setUser(String user) {
        this.user = user;
        return this;
    }

    public UserApi() {
        super();
        setMethod("auth");
        setCache(false);
    }

    @Override
    public Observable getObservable(Retrofit retrofit) {
        UserModel userModel = retrofit.create(UserModel.class);
        return userModel.login(user);
    }
}
