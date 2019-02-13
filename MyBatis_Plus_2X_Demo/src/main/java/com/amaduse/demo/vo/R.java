package com.amaduse.demo.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class R<T> implements Serializable {

    private String sign;

    private String code;

    private String message;

    private T data;

    public R() {
    }

    public R(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public R(String code, String message, T data, String sign) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.sign = sign;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
