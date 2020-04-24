package com.bw.pojo;

import java.io.Serializable;

public class Users implements Serializable {
    private Long uid;

    private String username;

    private String password;

    private String phone;

    private Long fund;

    private Long earn;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getFund() {
        return fund;
    }

    public void setFund(Long fund) {
        this.fund = fund;
    }

    public Long getEarn() {
        return earn;
    }

    public void setEarn(Long earn) {
        this.earn = earn;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", fund=" + fund +
                ", earn=" + earn +
                '}';
    }
}