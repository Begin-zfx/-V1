package com.zfx.entity;

import java.util.Date;

public class FeedBack {
    private Integer fdid;

    private Integer userid;

    private Integer cpid;

    private Date fdtime;

    private String fdtext;

    public Integer getFdid() {
        return fdid;
    }

    public void setFdid(Integer fdid) {
        this.fdid = fdid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }

    public Date getFdtime() {
        return fdtime;
    }

    public void setFdtime(Date fdtime) {
        this.fdtime = fdtime;
    }

    public String getFdtext() {
        return fdtext;
    }

    public void setFdtext(String fdtext) {
        this.fdtext = fdtext == null ? null : fdtext.trim();
    }
}