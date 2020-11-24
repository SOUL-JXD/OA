package com.sample;


public class Folder {

  private long id;
  private String foldName;
  private String foldPic;
  private String fcomment;
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


  public String getFoldName() {
    return foldName;
  }

  public void setFoldName(String foldName) {
    this.foldName = foldName;
  }


  public String getFoldPic() {
    return foldPic;
  }

  public void setFoldPic(String foldPic) {
    this.foldPic = foldPic;
  }


  public String getFcomment() {
    return fcomment;
  }

  public void setFcomment(String fcomment) {
    this.fcomment = fcomment;
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
