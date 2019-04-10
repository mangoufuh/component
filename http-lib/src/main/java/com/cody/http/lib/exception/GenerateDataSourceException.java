/*
 * ************************************************************
 * 文件：GenerateDataSourceException.java  模块：http-lib  项目：component
 * 当前修改时间：2019年04月07日 02:03:55
 * 上次修改时间：2019年04月06日 23:29:06
 * 作者：Cody.yi   https://github.com/codyer
 *
 * Copyright (c) 2019
 * ************************************************************
 */

package com.cody.http.lib.exception;


import com.cody.http.lib.config.HttpCode;
import com.cody.http.lib.exception.base.BaseException;

/**
 * Created by xu.yi. on 2019/4/6.
 */
public class GenerateDataSourceException extends BaseException {
    private static final long serialVersionUID = -5191572865283665745L;

    public GenerateDataSourceException(String errorMessage) {
        super(HttpCode.CODE_GENERATE_FAILED, errorMessage);
    }

    public GenerateDataSourceException() {
        super(HttpCode.CODE_GENERATE_FAILED, "生成代码失败");
    }

}