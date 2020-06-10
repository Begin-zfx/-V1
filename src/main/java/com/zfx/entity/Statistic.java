package com.zfx.entity;

import java.util.Date;

public class Statistic {
    private Integer staid;

    private Date stadate;

    private Integer seatu;

    private Integer seatr;

    private String oth1;

    private String oth2;

    public Integer getStaid() {
        return staid;
    }

    public void setStaid(Integer staid) {
        this.staid = staid;
    }

    public Date getStadate() {
        return stadate;
    }

    public void setStadate(Date stadate) {
        this.stadate = stadate;
    }

    public Integer getSeatu() {
        return seatu;
    }

    public void setSeatu(Integer seatu) {
        this.seatu = seatu;
    }

    public Integer getSeatr() {
        return seatr;
    }

    public void setSeatr(Integer seatr) {
        this.seatr = seatr;
    }

    public String getOth1() {
        return oth1;
    }

    public void setOth1(String oth1) {
        this.oth1 = oth1 == null ? null : oth1.trim();
    }

    public String getOth2() {
        return oth2;
    }

    public void setOth2(String oth2) {
        this.oth2 = oth2 == null ? null : oth2.trim();
    }
}