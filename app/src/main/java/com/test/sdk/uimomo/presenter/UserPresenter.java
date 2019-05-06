package com.test.sdk.uimomo.presenter;

import com.google.gson.Gson;
import com.test.sdk.uimomo.api.UserApi;
import com.test.sdk.uimomo.bean.User;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.vs.uimomo.http.callback.ViewListener;
import com.vs.uimomo.http.presenter.BaseMoPresenter;


/**
 * @author: S
 * @date: 2018/12/5 13:50
 * @description:
 */
public class UserPresenter extends BaseMoPresenter {
    public UserPresenter(RxAppCompatActivity appCompatActivity, ViewListener viewListener) {
        super(appCompatActivity, viewListener);
    }

    /**
     * 登录授权
     * @param user
     */
    public void UserLoginAuth(User user){
        httpManager.doHttpDeal(new UserApi().setUser(new Gson().toJson(user)));
    }


    /**
     * 登录授权,取消加载框
     * @param user
     */
    public void UserLoginAuth(User user, boolean toShowLoading){
        UserApi api = new UserApi();
        api.setShowProgress(toShowLoading);
        httpManager.doHttpDeal(api.setUser(new Gson().toJson(user)));
    }
}
