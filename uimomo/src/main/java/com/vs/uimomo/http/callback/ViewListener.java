/*
 * ************************************************************
 * 文件：ViewListener.java  模块：onewarehouse  项目：TestWarehouse
 * 当前修改时间：2018年11月12日 11:08:07
 * 上次修改时间：2018年11月08日 10:03:09
 * 作者：S
 * Copyright (c) 2018
 * ************************************************************
 */

package com.vs.uimomo.http.callback;

import com.wzgiceman.rxretrofitlibrary.retrofit_rx.exception.ApiException;

/**
 * @author: S
 * @date: 2018/11/7 11:33
 * @description:
 */
public interface ViewListener {

    /**
     * 成功后回调方法
     *
     * @param result
     * @param method
     */
    void onSuccess(String result, String method);

    /**
     * 失败
     * 失败或者错误方法
     * 自定义异常处理
     *
     * @param e
     * @param method
     */
    void onError(ApiException e, String method);
}
