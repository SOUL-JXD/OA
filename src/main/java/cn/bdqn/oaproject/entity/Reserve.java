package com.sample;


public class Reserve {

  private long id;
  private long meetId;
  private java.sql.Date startdate;
  private java.sql.Date enddate;
  private String rContent;
  private long recordby;
  private long reserveby;
  private java.sql.Date recordtime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMeetId() {
    return meetId;
  }

  public void setMeetId(long meetId) {
    this.meetId = meetId;
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


  public String getRContent() {
    return rContent;
  }

  public void setRContent(String rContent) {
    this.rContent = rContent;
  }


  public long getRecordby() {
    return recordby;
  }

  public void setRecordby(long recordby) {
    this.recordby = recordby;
  }


  public long getReserveby() {
    return reserveby;
  }

  public void setReserveby(long reserveby) {
    this.reserveby = reserveby;
  }


  public java.sql.Date getRecordtime() {
    return recordtime;
  }

  public void setRecordtime(java.sql.Date recordtime) {
    this.recordtime = recordtime;
  }

}
