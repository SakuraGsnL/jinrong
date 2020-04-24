package com.bw.pojo;

import java.io.Serializable;
import java.util.Date;

public class ProductDetails implements Serializable {
    private Long id;

    private Long loanMoney;

    private Long alreadyMoney;

    private Long remainMoney;

    private Date startDate;

    private Date jisuanDate;

    private Date endDate;

    private Long rate;

    private Long num;

    private Integer status;

    private Integer typeId;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(Long loanMoney) {
        this.loanMoney = loanMoney;
    }

    public Long getAlreadyMoney() {
        return alreadyMoney;
    }

    public void setAlreadyMoney(Long alreadyMoney) {
        this.alreadyMoney = alreadyMoney;
    }

    public Long getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(Long remainMoney) {
        this.remainMoney = remainMoney;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getJisuanDate() {
        return jisuanDate;
    }

    public void setJisuanDate(Date jisuanDate) {
        this.jisuanDate = jisuanDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}