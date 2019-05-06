/*
 * ************************************************************
 * 文件：BaseMoPresenter.java  模块：onewarehouse  项目：TestWarehouse
 * 当前修改时间：2018年11月12日 11:08:35
 * 上次修改时间：2018年11月09日 15:25:12
 * 作者：S
 * Copyright (c) 2018
 * ************************************************************
 */

package com.vs.uimomo.http.presenter;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.vs.uimomo.http.callback.ViewListener;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.exception.ApiException;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.http.HttpManager;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.listener.HttpOnNextListener;

/**
 * @author: S
 * @date: 2018/11/7 11:12
 * @description:
 */
public class BaseMoPresenter implements HttpOnNextListener {

    protected HttpManager httpManager;
    protected ViewListener viewListener;
    protected RxAppCompatActivity appCompatActivity;

    public BaseMoPresenter(RxAppCompatActivity appCompatActivity, ViewListener viewListener ) {
        this.viewListener = viewListener;
        this.appCompatActivity = appCompatActivity;
        this.httpManager = new HttpManager(this, appCompatActivity);
    }

    @Override
    public void onNext(String result, String method) {
        if (viewListener != null){
            viewListener.onSuccess(result,method);
        }
    }

    @Override
    public void onError(ApiException e, String method) {
//            BuglyCrash.PostCatchedException((Exception) e.getCause());
//        BuglyCrash.PostCatchedException(e);
        if (viewListener != null){
            viewListener.onError(e,method);
        }
    }
}
