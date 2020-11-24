package com.sample;


public class Affiche {

  private long id;
  private String affTitle;
  private long affstatus;
  private java.sql.Date startdate;
  private java.sql.Date enddate;
  private java.sql.Date pubdate;
  private String affContent;
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


  public String getAffTitle() {
    return affTitle;
  }

  public void setAffTitle(String affTitle) {
    this.affTitle = affTitle;
  }


  public long getAffstatus() {
    return affstatus;
  }

  public void setAffstatus(long affstatus) {
    this.affstatus = affstatus;
  }


  public java.sql.Date getStartdate() {
    return startdate;
  }

  public void setStartdate(java.sql.Date startdate) {
    this.startdate = startdate;
  }


  public java.sql.Date getEnddate() {
    return enddate;
  }

  public void setEnddate(java.sql.Date enddate) {
    this.enddate = enddate;
  }


  public java.sql.Date getPubdate() {
    return pubdate;
  }

  public void setPubdate(java.sql.Date pubdate) {
    this.pubdate = pubdate;
  }


  public String getAffContent() {
    return affContent;
  }

  public void setAffContent(String affContent) {
    this.affContent = affContent;
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
