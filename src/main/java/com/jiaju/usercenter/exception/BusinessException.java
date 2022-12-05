package com.jiaju.usercenter.exception;

import com.jiaju.usercenter.common.ErrorCode;

public class BusinessException extends RuntimeException{
    private final int code;

    private final String desc;

    public BusinessException(String message, int code, String desc) {
        super(message);
        this.code = code;
        this.desc = desc;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.code = errorCode.getCode();
        this.desc = errorCode.getDesc();
    }

    public BusinessException(ErrorCode errorCode, String desc) {
        super(errorCode.getMsg());
        this.code = errorCode.getCode();
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
