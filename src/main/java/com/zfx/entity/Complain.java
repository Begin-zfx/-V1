package com.zfx.entity;

import java.util.Date;

public class Complain {
    private Integer cpid;

    private Integer userid;

    private Date cpdate;

    private String cptext;

    private String ps;

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCpdate() {
        return cpdate;
    }

    public void setCpdate(Date cpdate) {
        this.cpdate = cpdate;
    }

    public String getCptext() {
        return cptext;
    }

    public void setCptext(String cptext) {
        this.cptext = cptext == null ? null : cptext.trim();
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps == null ? null : ps.trim();
    }
}