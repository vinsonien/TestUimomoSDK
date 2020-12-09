package com.test.sdk.uimomo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.test.sdk.uimomo.bean.User;
import com.test.sdk.uimomo.presenter.TestPresenter;
import com.test.sdk.uimomo.ui.BaseActivity;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.exception.ApiException;


import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn)
    Button btn;

    TestPresenter userPresent;

    @Override
    protected int OnContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void Init() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                userPresent.UserLoginAuth(user);

            }
        });
    }

    @Override
    protected void Init(Bundle savedInstanceState) {

    }

    @Override
    protected void InitPresenter() {
        if (userPresent == null){
            userPresent = new TestPresenter(MainActivity.this,MainActivity.this);
        }
    }

    @Override
    protected void DestroyPresenter() {
        userPresent = null;
    }


    @Override
    public void onSuccess(String result, String method) {
        super.onSuccess(result, method);
        Log.e("TAG","activity33 ===" + result);

    }

    @Override
    public void onError(ApiException e, String method) {
        super.onError(e, method);
        Log.e("TAG","method=333333333 ==" + e);
    }

    @Override
    public void onNetworkError(String method) {

    }

    @Override
    public void onShowLoading(String method) {

    }

    @Override
    public void onHideLoading(String method) {

    }
}
