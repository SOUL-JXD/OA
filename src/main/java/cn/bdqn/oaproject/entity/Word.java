package com.sample;


public class Word {

  private long id;
  private String wName;
  private long publicity;
  private long wPro;
  private String picpath;
  private String wcomment;
  private long folderId;
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


  public String getWName() {
    return wName;
  }

  public void setWName(String wName) {
    this.wName = wName;
  }


  public long getPublicity() {
    return publicity;
  }

  public void setPublicity(long publicity) {
    this.publicity = publicity;
  }


  public long getWPro() {
    return wPro;
  }

  public void setWPro(long wPro) {
    this.wPro = wPro;
  }


  public String getPicpath() {
    return picpath;
  }

  public void setPicpath(String picpath) {
    this.picpath = picpath;
  }


  public String getWcomment() {
    return wcomment;
  }

  public void setWcomment(String wcomment) {
    this.wcomment = wcomment;
  }


  public long getFolderId() {
    return folderId;
  }

  public void setFolderId(long folderId) {
    this.folderId = folderId;
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
