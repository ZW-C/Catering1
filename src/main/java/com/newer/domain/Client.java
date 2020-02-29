package com.newer.domain;

import java.util.Date;

public class Client {

    private Integer clientId;// 客户编号
    private String clientName; // 姓名
    private String clientSex; //性别
    private Date clientBirdate;//出生日期
    private String clientCard; // 身份证
    private String clientPhone; //电话号码
    private String clientAccount; // 账号
    private String clientPwd;//密码
    private String clientNn;//昵称
    private String clientEmail; //邮箱
    private String clientComment; //备注

    public Client() {
    }

    public Client(Integer clientId, String clientName, String clientSex, Date clientBirdate, String clientCard, String clientPhone, String clientAccount, String clientPwd, String clientNn, String clientEmail, String clientComment) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientSex = clientSex;
        this.clientBirdate = clientBirdate;
        this.clientCard = clientCard;
        this.clientPhone = clientPhone;
        this.clientAccount = clientAccount;
        this.clientPwd = clientPwd;
        this.clientNn = clientNn;
        this.clientEmail = clientEmail;
        this.clientComment = clientComment;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSex() {
        return clientSex;
    }

    public void setClientSex(String clientSex) {
        this.clientSex = clientSex;
    }

    public Date getClientBirdate() {
        return clientBirdate;
    }

    public void setClientBirdate(Date clientBirdate) {
        this.clientBirdate = clientBirdate;
    }

    public String getClientCard() {
        return clientCard;
    }

    public void setClientCard(String clientCard) {
        this.clientCard = clientCard;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientAccount() {
        return clientAccount;
    }

    public void setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
    }

    public String getClientPwd() {
        return clientPwd;
    }

    public void setClientPwd(String clientPwd) {
        this.clientPwd = clientPwd;
    }

    public String getClientNn() {
        return clientNn;
    }

    public void setClientNn(String clientNn) {
        this.clientNn = clientNn;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientComment() {
        return clientComment;
    }

    public void setClientComment(String clientComment) {
        this.clientComment = clientComment;
    }
}
