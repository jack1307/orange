package com.anonymous.orange.util;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author wangyun
 * @Date 2020-12-21 16:27
 */
@Data
public class ResultObject<T> implements Serializable {

    private Integer errorCode;

    private String message;

    private Boolean success;

    private T result;

    private Boolean isSuccess(){
        return this.success;
    }

    private boolean isFail(){
        if (Objects.isNull(this.success)) {
        }
        return !this.success;
    }

    private ResultObject(){
        this.success = true;
    }

    private ResultObject(Integer errorCode, String message){
        this.errorCode = errorCode;
        this.message = message;
        this.success = false;
    }

    private ResultObject(Integer errorCode, String message, Object... errorMessageArgs){
        this.errorCode = errorCode;
        this.message = message;
        this.success = false;
    }

    private ResultObject(String message){
        this.message = message;
        this.success = true;
    }

    private ResultObject(String message, T result){
        this.message = message;
        this.result = result;
        this.success = true;
    }



}
