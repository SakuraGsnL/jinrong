package com.bw.common;

import java.io.Serializable;

public class CodeMsg implements Serializable {

    private int code;
    private String msg;

    //同意管理码表
    //通用模块
    public static CodeMsg COMMON_SUCCESS = new CodeMsg(000000,"success");
    public static CodeMsg COMMON_ACCESSERROR = new CodeMsg(000001,"非法访问!!!");
    public static CodeMsg COMMON_VERIFYCODEERROR = new CodeMsg(000002,"验证码错误");

    //登录模块
    public static CodeMsg LOGIN_NAMEORPASSWORDERROR = new CodeMsg(100001,"用户名或密码错误");
    public static CodeMsg LOGIN_LOGINPERMISSION = new CodeMsg(100002,"用户没有登录");

    //秒杀模块
    public static CodeMsg MIAOSHA_NOSTOCK = new CodeMsg(200001,"库存不足");
    public static CodeMsg MIAOSHA_ORDERFAIL = new CodeMsg(200002,"下单失败");
    public static CodeMsg MIAOSHA_NOREPEAT = new CodeMsg(200003,"不得重复秒杀同一商品");
    public static CodeMsg MIAOSHA_VISITLIMIT = new CodeMsg(200004,"操作频繁,请稍后再试");

    //支付模块

    public CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
