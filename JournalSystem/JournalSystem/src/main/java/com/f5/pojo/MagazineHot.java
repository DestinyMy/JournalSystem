package com.f5.pojo;

public class MagazineHot {
	private int id;
	private String journalname;
	private int pubyear;
	private int pubvolume;
	private int pubphase;
	private int num;
	private int regid;
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "MagazineHot [id=" + id + ", journalname=" + journalname + ", pubyear=" + pubyear + ", pubvolume="
				+ pubvolume + ", pubphase=" + pubphase + ", num=" + num + ", regid=" + regid + "]";
	}
	
	
}
