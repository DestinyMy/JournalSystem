package com.f5.pojo;

public class BorrowItem {
	private int id;
	private String userid;
	private String username;
	private String journalname;
	private int pubyear;
	private int pubvolume;
	private int pubphase;
	private int regid;
	private int state;//0表示借出，1表示提请归还，2表示确认归还
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJournalname() {
		return journalname;
	}
	public void setJournalname(String journalname) {
		this.journalname = journalname;
	}
	public int getPubyear() {
		return pubyear;
	}
	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}
	public int getPubvolume() {
		return pubvolume;
	}
	public void setPubvolume(int pubvolume) {
		this.pubvolume = pubvolume;
	}
	public int getPubphase() {
		return pubphase;
	}
	public void setPubphase(int pubphase) {
		this.pubphase = pubphase;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
