package com.zfx.entity;

public class Room {
    private Integer roomid;

    private String seatcount;

    private Float searrate;

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getSeatcount() {
        return seatcount;
    }

    public void setSeatcount(String seatcount) {
        this.seatcount = seatcount == null ? null : seatcount.trim();
    }

    public Float getSearrate() {
        return searrate;
    }

    public void setSearrate(Float searrate) {
        this.searrate = searrate;
    }
}