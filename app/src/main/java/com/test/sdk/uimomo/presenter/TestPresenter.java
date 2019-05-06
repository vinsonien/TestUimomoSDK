package com.test.sdk.uimomo.presenter;


import com.test.sdk.uimomo.api.TestApi;
import com.test.sdk.uimomo.bean.User;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.vs.uimomo.http.callback.ViewListener;
import com.vs.uimomo.http.presenter.BaseMoPresenter;


/**
 * @author: S
 * @date: 2018/12/5 13:50
 * @description:
 */
public class TestPresenter extends BaseMoPresenter {
    public TestPresenter(RxAppCompatActivity appCompatActivity, ViewListener viewListener) {
        super(appCompatActivity, viewListener);
    }

    /**
     * 登录授权
     * @param user
     */
    public void UserLoginAuth(User user){
        TestApi api = new TestApi();
        httpManager.doHttpDeal(api.setUser(user));
    }


    /**
     * 登录授权,取消加载框
     * @param user
     */
    public void UserLoginAuth(User user, boolean toShowLoading){
        TestApi api = new TestApi();
        api.setShowProgress(toShowLoading);
        httpManager.doHttpDeal(api.setUser(user));
    }
}
