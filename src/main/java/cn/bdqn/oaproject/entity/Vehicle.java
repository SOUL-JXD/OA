package com.sample;


public class Vehicle {

  private long id;
  private String vplate;
  private String vmodel;
  private String vnumber;
  private long callId;
  private String vcomment;
  private long createdby;
  private java.sql.Date createdtime;
  private long modifyby;
  private java.sql.Date modifytime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getVplate() {
    return vplate;
  }

  public void setVplate(String vplate) {
    this.vplate = vplate;
  }


  public String getVmodel() {
    return vmodel;
  }

  public void setVmodel(String vmodel) {
    this.vmodel = vmodel;
  }


  public String getVnumber() {
    return vnumber;
  }

  public void setVnumber(String vnumber) {
    this.vnumber = vnumber;
  }


  public long getCallId() {
    return callId;
  }

  public void setCallId(long callId) {
    this.callId = callId;
  }


  public String getVcomment() {
    return vcomment;
  }

  public void setVcomment(String vcomment) {
    this.vcomment = vcomment;
  }


  public long getCreatedby() {
    return createdby;
  }

  public void setCreatedby(long createdby) {
    this.createdby = createdby;
  }


  public java.sql.Date getCreatedtime() {
    return createdtime;
  }

  public void setCreatedtime(java.sql.Date createdtime) {
    this.createdtime = createdtime;
  }


  public long getModifyby() {
    return modifyby;
  }

  public void setModifyby(long modifyby) {
    this.modifyby = modifyby;
  }


  public java.sql.Date getModifytime() {
    return modifytime;
  }

  public void setModifytime(java.sql.Date modifytime) {
    this.modifytime = modifytime;
  }

}
