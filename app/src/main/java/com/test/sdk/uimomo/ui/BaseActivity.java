package com.test.sdk.uimomo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.vs.uimomo.http.callback.ViewListener;
import com.vs.uimomo.ui.BaseMoActivity;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.exception.ApiException;

import butterknife.ButterKnife;

/**
 * @author: S
 * @date: 2019/5/6 10:09
 * @description:
 */
public abstract class BaseActivity extends BaseMoActivity implements ViewListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void BindingLayout() {
        ButterKnife.bind(this);
    }

    @Override
    protected void InitPresenter() {

    }

    @Override
    protected void DestroyPresenter() {

    }

    @Override
    public void onSuccess(String result, String method) {
        Log.e("TAG","22222result===");
    }

    @Override
    public void onError(ApiException e, String method) {
        Log.e("TAG","e===2222做上传异常到bugly的操作");
    }

}
