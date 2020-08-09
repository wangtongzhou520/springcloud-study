package com.springcloud.study.common.core.vo;


import java.io.Serializable;

/**
 * 公共返回
 *
 * @author wangtongzhou
 * @since 2020-05-23 13:44
 */
public class CommonResponse<T> implements Serializable {

    /**
     * 成功状态码
     */
    private final static String SUCCESS_CODE = "SUCCESS";

    /**
     * 提示信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 状态码
     */
    private String code;

    /**
     * 状态
     */
    private Boolean state;


    /**
     * 成功
     *
     * @param <T> 泛型
     * @return 返回结果
     */
    public static <T> CommonResponse<T> ok() {
        return ok(null);
    }

    /**
     * 成功
     *
     * @param data 传入的对象
     * @param <T>  泛型
     * @return 返回结果
     */
    public static <T> CommonResponse<T> ok(T data) {
        CommonResponse<T> response = new CommonResponse<T>();
        response.code = SUCCESS_CODE;
        response.data = data;
        response.message = "返回成功";
        response.state = true;
        return response;
    }

    /**
     * 错误
     *
     * @param code    自定义code
     * @param message 自定义返回信息
     * @param <T>     泛型
     * @return 返回信息
     */
    public static <T> CommonResponse<T> error(String code, String message) {
        CommonResponse<T> response = new CommonResponse<T>();
        response.code = code;
        response.data = null;
        response.message = message;
        response.state = false;
        return response;
    }

    public Boolean getState() {
        return state;
    }

    public CommonResponse<T> setState(Boolean state) {
        this.state = state;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CommonResponse<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public CommonResponse<T> setData(T data) {
        this.data = data;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CommonResponse<T> setCode(String code) {
        this.code = code;
        return this;
    }
}

