package com.zfx.entity;

import java.util.Date;

public class Seatuse {
    private Integer seatuseid;

    private Integer userid;

    private Integer seatid;

    private Date begintime;

    private Date endtime;

    private String state;

    public Integer getSeatuseid() {
        return seatuseid;
    }

    public void setSeatuseid(Integer seatuseid) {
        this.seatuseid = seatuseid;
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

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}