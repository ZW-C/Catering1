package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable {

    private Integer clientId;
    private String memberGrade;
    private Date memberUpd;
    private int sumGrowth;
    private Date beginDate;
    private Date endDate;
    private double discount;
    private String memberCause;
    private String memberComment;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(String memberGrade) {
        this.memberGrade = memberGrade;
    }

    public Date getMemberUpd() {
        return memberUpd;
    }

    public void setMemberUpd(Date memberUpd) {
        this.memberUpd = memberUpd;
    }

    public int getSumGrowth() {
        return sumGrowth;
    }

    public void setSumGrowth(int sumGrowth) {
        this.sumGrowth = sumGrowth;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getMemberCause() {
        return memberCause;
    }

    public void setMemberCause(String memberCause) {
        this.memberCause = memberCause;
    }

    public String getMemberComment() {
        return memberComment;
    }

    public void setMemberComment(String memberComment) {
        this.memberComment = memberComment;
    }

    public Member() {
    }

    public Member(Integer clientId, String memberGrade, Date memberUpd, int sumGrowth, Date beginDate, Date endDate, double discount, String memberCause, String memberComment) {
        this.clientId = clientId;
        this.memberGrade = memberGrade;
        this.memberUpd = memberUpd;
        this.sumGrowth = sumGrowth;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.discount = discount;
        this.memberCause = memberCause;
        this.memberComment = memberComment;
    }
}
