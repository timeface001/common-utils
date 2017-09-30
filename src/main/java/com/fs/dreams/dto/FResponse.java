package com.fs.dreams.dto;

/**
 * @author fengsong
 * @description:一句话描述下类的功能
 * @time 2017-07-17 8:51
 **/
public class FResponse<T> {

    private String code;

    private String message;

    private T result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public FResponse(){

    }

    public FResponse(String code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }
}
