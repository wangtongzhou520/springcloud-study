package com.springcloud.study.common.core.constant;

/**
 * 系统错误
 * P_XX 参数异常_错误信息
 * B_XX 业务异常_错误信息
 * S_XX 系统异常_错误信息
 *
 * @author wangtongzhou
 * @since 2020-05-31 21:15
 */
public enum CommonExceptionEnum {


    /**
     * 系统未授权
     */
    S_UNAUTHORIZED("S_UNAUTHORIZED", "系统未授权"),

    /**
     * 参数异常
     */
    P_PARAM("P_PARAM", "参数异常");



    private String code;

    private String message;

    CommonExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public CommonExceptionEnum setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CommonExceptionEnum setMessage(String message) {
        this.message = message;
        return this;
    }
}
