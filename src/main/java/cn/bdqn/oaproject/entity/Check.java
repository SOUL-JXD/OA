package com.sample;


public class Check {

  private long id;
  private long auditId;
  private long resultId;
  private String copinion;
  private java.sql.Date cdate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getAuditId() {
    return auditId;
  }

  public void setAuditId(long auditId) {
    this.auditId = auditId;
  }


  public long getResultId() {
    return resultId;
  }

  public void setResultId(long resultId) {
    this.resultId = resultId;
  }


  public String getCopinion() {
    return copinion;
  }

  public void setCopinion(String copinion) {
    this.copinion = copinion;
  }


  public java.sql.Date getCdate() {
    return cdate;
  }

  public void setCdate(java.sql.Date cdate) {
    this.cdate = cdate;
  }

}
