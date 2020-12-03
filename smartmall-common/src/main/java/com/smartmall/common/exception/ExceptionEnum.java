package com.smartmall.common.exception;

/**
 * Created by Miaojiale on 2020/11/28.
 */
public enum ExceptionEnum {
    Valid_Fail(10001,"校验失败"),Unknown_Exception(10000,"未知错误");
    private int code;
    private String desc;

    ExceptionEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
