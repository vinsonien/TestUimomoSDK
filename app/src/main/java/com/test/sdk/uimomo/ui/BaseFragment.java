package com.test.sdk.uimomo.ui;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.vs.uimomo.http.callback.ViewListener;
import com.vs.uimomo.ui.BaseMoFragment;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.exception.ApiException;

import butterknife.ButterKnife;

/**
 * @author: S
 * @date: 2019/5/6 10:45
 * @description:
 */
public abstract class BaseFragment extends BaseMoFragment implements ViewListener {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void BindingLayout(View v) {
        ButterKnife.bind(this,v);
    }

    @Override
    public void onSuccess(String result, String method) {
        Log.e("TAG","result===");
    }

    @Override
    public void onError(ApiException e, String method) {
        Log.e("TAG","e===做上传异常都bugly的操作");
    }

}
