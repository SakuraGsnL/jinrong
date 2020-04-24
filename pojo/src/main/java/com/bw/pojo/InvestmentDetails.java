package com.bw.pojo;

import java.io.Serializable;
import java.util.Date;

public class InvestmentDetails implements Serializable {
    private Long id;

    private Long userId;

    private Long detailsId;

    private Date jutiDate;

    private Long money;

    private Long yuqiMoney;

    private Long shijiMoney;

    private Long loanMoney;

    private Date loanDate;

    private Integer touStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Long detailsId) {
        this.detailsId = detailsId;
    }

    public Date getJutiDate() {
        return jutiDate;
    }

    public void setJutiDate(Date jutiDate) {
        this.jutiDate = jutiDate;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Long getYuqiMoney() {
        return yuqiMoney;
    }

    public void setYuqiMoney(Long yuqiMoney) {
        this.yuqiMoney = yuqiMoney;
    }

    public Long getShijiMoney() {
        return shijiMoney;
    }

    public void setShijiMoney(Long shijiMoney) {
        this.shijiMoney = shijiMoney;
    }

    public Long getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(Long loanMoney) {
        this.loanMoney = loanMoney;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Integer getTouStatus() {
        return touStatus;
    }

    public void setTouStatus(Integer touStatus) {
        this.touStatus = touStatus;
    }
}