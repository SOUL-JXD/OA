package com.sample;


public class Log {

  private long id;
  private long userId;
  private long roleId;
  private String incident;
  private String logcomment;
  private java.sql.Date opedate;


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


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getIncident() {
    return incident;
  }

  public void setIncident(String incident) {
    this.incident = incident;
  }


  public String getLogcomment() {
    return logcomment;
  }

  public void setLogcomment(String logcomment) {
    this.logcomment = logcomment;
  }


  public java.sql.Date getOpedate() {
    return opedate;
  }

  public void setOpedate(java.sql.Date opedate) {
    this.opedate = opedate;
  }

}
