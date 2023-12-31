package com.crud.bean;
import java.util.Date;

public class BoardVO {
    private int seq;
    private String tag;
    private String writer;
    private String content;
    private Date regdate;
    private Date birthdate;
    private String country;
    private String  gender;

    public int getSeq() {
        return seq;
    }
    public void setSeq(int seq) {
        this.seq = seq;
    }
    public String getTag() { return tag;}
    public void setTag(String title) {
        this.tag = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getRegdate() {
        return regdate;
    }
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
    public Date getBirthdate() { return birthdate;}
    public void setBirthdate(Date birthdate) { this.birthdate = birthdate;}
    public String getCountry() { return country;}
    public void setCountry(String country) { this.country = country;}
    public String getGender() { return gender;}
    public void setGender(String gender) { this.gender = gender;}
}