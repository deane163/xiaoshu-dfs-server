package com.xiaoshu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @Description : function description
 * ---------------------------------
 * @Author : deane
 * @Date : Create in 2021/1/10 10:59
 * <p>
 * Copyright (C)2013-2021 小树盛凯科技 All rights reserved.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code;

    private String message;

    private long currentTimes;

    private T data;

    public ResultVo(ResultCode resultCode, T data) {
        this.code = resultCode.code();
        this.message = resultCode.msg();
        this.currentTimes = System.currentTimeMillis();
        this.data = data;
    }

}
