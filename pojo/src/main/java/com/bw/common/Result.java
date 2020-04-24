package com.bw.common;

import java.io.Serializable;

public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;

    //success 成功
    public static Result success(Object data){
        return new Result(CodeMsg.COMMON_SUCCESS,data);
    }

    //fail 失败
    public static Result fail(CodeMsg codeMsg){
        return new Result(codeMsg);
    }

    public Result() {
    }

    public Result(CodeMsg codeMsg) {
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }

    public Result(CodeMsg codeMsg, Object data) {
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
