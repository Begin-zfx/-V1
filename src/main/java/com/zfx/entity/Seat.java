package com.zfx.entity;

public class Seat {
    private Integer seatid;

    private Integer roomid;

    private String seatstate;

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getSeatstate() {
        return seatstate;
    }

    public void setSeatstate(String seatstate) {
        this.seatstate = seatstate == null ? null : seatstate.trim();
    }
}