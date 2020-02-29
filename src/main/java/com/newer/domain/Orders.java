package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class Orders implements Serializable {

    private Integer ordersId;
    private Integer clientId;
    private String clientName;
    private int roomsId;
    private String roomsName;
    private Date startTime;
    private Date endTime;
    private Date ordersTime;
    private double ensureMoney;
    private double discount;
    private double totalPrices;
    private double disPrices;
    private String ordersState;
    private int deductIg;
    private Date paymentTime;
    private int integral;
    private int orderCount;
    private String ordersComment;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
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

    public int getRoomsId() {
        return roomsId;
    }

    public void setRoomsId(int roomsId) {
        this.roomsId = roomsId;
    }

    public String getRoomsName() {
        return roomsName;
    }

    public void setRoomsName(String roomsName) {
        this.roomsName = roomsName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getOrdersTime() {
        return ordersTime;
    }

    public void setOrdersTime(Date ordersTime) {
        this.ordersTime = ordersTime;
    }

    public double getEnsureMoney() {
        return ensureMoney;
    }

    public void setEnsureMoney(double ensureMoney) {
        this.ensureMoney = ensureMoney;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPrices() {
        return totalPrices;
    }

    public void setTotalPrices(double totalPrices) {
        this.totalPrices = totalPrices;
    }

    public double getDisPrices() {
        return disPrices;
    }

    public void setDisPrices(double disPrices) {
        this.disPrices = disPrices;
    }

    public String getOrdersState() {
        return ordersState;
    }

    public void setOrdersState(String ordersState) {
        this.ordersState = ordersState;
    }

    public int getDeductIg() {
        return deductIg;
    }

    public void setDeductIg(int deductIg) {
        this.deductIg = deductIg;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public String getOrdersComment() {
        return ordersComment;
    }

    public void setOrdersComment(String ordersComment) {
        this.ordersComment = ordersComment;
    }

    public Orders() {
    }

    public Orders(Integer ordersId, Integer clientId, String clientName, int roomsId, String roomsName, Date startTime, Date endTime, Date ordersTime, double ensureMoney, double discount, double totalPrices, double disPrices, String ordersState, int deductIg, Date paymentTime, int integral, int orderCount, String ordersComment) {
        this.ordersId = ordersId;
        this.clientId = clientId;
        this.clientName = clientName;
        this.roomsId = roomsId;
        this.roomsName = roomsName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.ordersTime = ordersTime;
        this.ensureMoney = ensureMoney;
        this.discount = discount;
        this.totalPrices = totalPrices;
        this.disPrices = disPrices;
        this.ordersState = ordersState;
        this.deductIg = deductIg;
        this.paymentTime = paymentTime;
        this.integral = integral;
        this.orderCount = orderCount;
        this.ordersComment = ordersComment;
    }
}
