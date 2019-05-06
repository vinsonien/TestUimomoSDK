package com.test.sdk.uimomo.http;


import com.wzgiceman.rxretrofitlibrary.retrofit_rx.Api.BaseApi;

/**
 * @author: S
 * @date: 2018/12/5 14:02
 * @description:
 */
public abstract class BaseAppApi extends BaseApi {

    public BaseAppApi() {
        setBaseUrl(ApiConfig.ServerDomain);
    }
}
