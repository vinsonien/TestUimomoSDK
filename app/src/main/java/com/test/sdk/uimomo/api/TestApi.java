package com.test.sdk.uimomo.api;


import com.test.sdk.uimomo.bean.User;
import com.test.sdk.uimomo.http.BaseAppApi;
import com.test.sdk.uimomo.model.TestModel;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * @author: S
 * @date: 2018/12/5 13:48
 * @description:
 */
public class TestApi extends BaseAppApi {
    private User user;

    public TestApi setUser(User user) {
        this.user = user;
        return this;
    }

    public TestApi() {
        super();
//        setMethod("auth");
        setCache(false);
    }

//    @Override
//    public Observable getObservable(Retrofit retrofit) {
//        UserModel userModel = retrofit.create(UserModel.class);
//        return userModel.login(user);
//    }

    @Override
    public Observable getObservable(Retrofit retrofit) {
        TestModel userModel = retrofit.create(TestModel.class);
        return userModel.login(user.getKey());
    }
}
