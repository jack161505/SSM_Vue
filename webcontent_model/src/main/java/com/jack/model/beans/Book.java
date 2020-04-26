package com.jack.model.beans;

import java.math.BigInteger;

/**
 * @Author: 李善玺
 * @Date: 2020/4/23 16:39
 * @Version 1.0
 */
public class Book {
    private String bid;
    private String bname;
    private String fid;
    private String fname;
    private BigInteger count;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }
}
