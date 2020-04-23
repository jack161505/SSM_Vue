package com.jack.model.beans;

/**
 * @Author: 李善玺
 * @Date: 2020/4/23 16:39
 * @Version 1.0
 */
public class Book {
    private Integer bookid;
    private String name;
    private Integer cnt;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }
}
