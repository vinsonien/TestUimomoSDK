package com.test.sdk.uimomo;

import android.app.Application;

import com.test.sdk.uimomo.http.ApiConfig;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.RxRetrofitApp;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        InitRxRetrofit(true);
    }


    /**
     * RxRetrofit 修改域名
     */
    private void InitRxRetrofit(boolean isDebug) {
        RxRetrofitApp.init(this, true, ApiConfig.ServerDomain);
    }

}
