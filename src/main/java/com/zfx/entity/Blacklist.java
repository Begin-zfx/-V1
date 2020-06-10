package com.zfx.entity;

import java.util.Date;

public class Blacklist {
    private Integer blackid;

    private Integer userid;

    private Date begintime;

    private String cause;

    private String status;

    public Integer getBlackid() {
        return blackid;
    }

    public void setBlackid(Integer blackid) {
        this.blackid = blackid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}