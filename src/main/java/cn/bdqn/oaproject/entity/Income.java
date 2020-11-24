package com.sample;


public class Income {

  private long id;
  private long userId;
  private java.sql.Date applydate;
  private long deptId;
  private long postId;
  private String applyment;
  private long checkId;
  private long createdby;
  private java.sql.Date createdtime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public java.sql.Date getApplydate() {
    return applydate;
  }

  public void setApplydate(java.sql.Date applydate) {
    this.applydate = applydate;
  }


  public long getDeptId() {
    return deptId;
  }

  public void setDeptId(long deptId) {
    this.deptId = deptId;
  }


  public long getPostId() {
    return postId;
  }

  public void setPostId(long postId) {
    this.postId = postId;
  }


  public String getApplyment() {
    return applyment;
  }

  public void setApplyment(String applyment) {
    this.applyment = applyment;
  }


  public long getCheckId() {
    return checkId;
  }

  public void setCheckId(long checkId) {
    this.checkId = checkId;
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

}
