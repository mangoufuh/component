/*
 * ************************************************************
 * 文件：NotProguard.java  模块：util-core  项目：component
 * 当前修改时间：2019年04月11日 11:51:31
 * 上次修改时间：2017年08月11日 15:01:20
 * 作者：Cody.yi   https://github.com/codyer
 *
 * Copyright (c) 2019
 * ************************************************************
 */

package com.cody.component.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * NotProguard, Means not proguard something, like class, method, field<br/>
 *
 * @author <a href="http://www.trinea.cn" target="_blank">Trinea</a> 2015-08-07
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
public @interface NotProguard {

}