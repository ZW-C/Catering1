package com.newer.domain;

import java.io.Serializable;

public class Rooms implements Serializable {

    private Integer roomsId;
    private String roomsName;
    private double roomsPrice;
    private String roomState;
    private int roomsMax;
    private String roomsFacility;
    private String roomsComment;

    public Integer getRoomsId() {
        return roomsId;
    }

    public void setRoomsId(Integer roomsId) {
        this.roomsId = roomsId;
    }

    public String getRoomsName() {
        return roomsName;
    }

    public void setRoomsName(String roomsName) {
        this.roomsName = roomsName;
    }

    public double getRoomsPrice() {
        return roomsPrice;
    }

    public void setRoomsPrice(double roomsPrice) {
        this.roomsPrice = roomsPrice;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public int getRoomsMax() {
        return roomsMax;
    }

    public void setRoomsMax(int roomsMax) {
        this.roomsMax = roomsMax;
    }

    public String getRoomsFacility() {
        return roomsFacility;
    }

    public void setRoomsFacility(String roomsFacility) {
        this.roomsFacility = roomsFacility;
    }

    public String getRoomsComment() {
        return roomsComment;
    }

    public void setRoomsComment(String roomsComment) {
        this.roomsComment = roomsComment;
    }

    public Rooms() {
    }

    public Rooms(Integer roomsId, String roomsName, double roomsPrice, String roomState, int roomsMax, String roomsFacility, String roomsComment) {
        this.roomsId = roomsId;
        this.roomsName = roomsName;
        this.roomsPrice = roomsPrice;
        this.roomState = roomState;
        this.roomsMax = roomsMax;
        this.roomsFacility = roomsFacility;
        this.roomsComment = roomsComment;
    }
}
