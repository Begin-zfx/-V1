package com.zfx.entity;

import java.util.Date;

public class SeatResver {
    private Integer resverid;

    private Integer userid;

    private Integer seatid;

    private Date btime;

    private Date etime;

    private String state;

    public Integer getResverid() {
        return resverid;
    }

    public void setResverid(Integer resverid) {
        this.resverid = resverid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}