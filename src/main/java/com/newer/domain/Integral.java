package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class Integral implements Serializable {
    private Integer clientId;
    private int integralAdd;
    private String causeAdd;
    private int integralDel;
    private String causeDel;
    private Date updDate;
    private int integralSum;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public int getIntegralAdd() {
        return integralAdd;
    }

    public void setIntegralAdd(int integralAdd) {
        this.integralAdd = integralAdd;
    }

    public String getCauseAdd() {
        return causeAdd;
    }

    public void setCauseAdd(String causeAdd) {
        this.causeAdd = causeAdd;
    }

    public int getIntegralDel() {
        return integralDel;
    }

    public void setIntegralDel(int integralDel) {
        this.integralDel = integralDel;
    }

    public String getCauseDel() {
        return causeDel;
    }

    public void setCauseDel(String causeDel) {
        this.causeDel = causeDel;
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

    public int getIntegralSum() {
        return integralSum;
    }

    public void setIntegralSum(int integralSum) {
        this.integralSum = integralSum;
    }

    public Integral() {
    }

    public Integral(Integer clientId, int integralAdd, String causeAdd, int integralDel, String causeDel, Date updDate, int integralSum) {
        this.clientId = clientId;
        this.integralAdd = integralAdd;
        this.causeAdd = causeAdd;
        this.integralDel = integralDel;
        this.causeDel = causeDel;
        this.updDate = updDate;
        this.integralSum = integralSum;
    }
}
