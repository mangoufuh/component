/*
 * ************************************************************
 * 文件：PageDataCallBack.java  模块：bind-list  项目：component
 * 当前修改时间：2019年04月09日 15:13:06
 * 上次修改时间：2019年04月09日 15:11:17
 * 作者：Cody.yi   https://github.com/codyer
 *
 * Copyright (c) 2019
 * ************************************************************
 */

package com.cody.component.list.callback;


import com.cody.component.list.define.PageInfo;
import com.cody.http.lib.bean.ListResult;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by xu.yi. on 2019/4/8.
 * 获取分页数据后进行回调的接口
 */
public interface PageDataCallBack<ItemBean> {
    /**
     * eg: callBack.onSuccess(listResult.getData().getItems(), PageInfo.getPrePageInfo(listResult), PageInfo.getNextPageInfo(listResult));
     */
    void onSuccess(@NonNull List<ItemBean> data, @Nullable PageInfo prePageKey, @Nullable PageInfo nextPageKey);

    /**
     * eg: callBack.onSuccess(listResult);
     */
    default void onSuccess(@NonNull ListResult<ItemBean> listResult) {
        onSuccess(listResult.getData().getItems(), PageInfo.getPrePageInfo(listResult), PageInfo.getNextPageInfo(listResult));
    }

    /**
     * eg: callBack.onFailure(message);
     */
    void onFailure(String message);
}