package com.xiaoshu.model;

/**
 * 功能说明： 返回值的枚举类型
 *
 * @ com.xiaoshu.model
 * <p>
 * Original @Author: deane.jia-贾亮亮,@2020/9/29@14:20
 * <p>
 * Copyright (C)2012-@2020 深圳小树盛凯科技 All rights reserved.
 */
public enum ResultCode {

    SUCCESS(0, "success"),

    ERROR(10001, "success"),

    Fail(1000, "To many access");

    private int code;

    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {
        return this.code;
    }

    public String msg() {
        return this.msg;
    }


}
