package com.f5.pojo;

public class MagazineHotDetail {
	private int id;
	private String journalname;
	private String CNnumber;
	private String ISSN;
	private String postNumber;
	private String pubcycle;
	private String pubplace;
	private String pubhost;
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
	public String getCNnumber() {
		return CNnumber;
	}
	public void setCNnumber(String cNnumber) {
		CNnumber = cNnumber;
	}
	public String getISSN() {
		return ISSN;
	}
	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}
	public String getPostNumber() {
		return postNumber;
	}
	public void setPostNumber(String postNumber) {
		this.postNumber = postNumber;
	}
	public String getPubcycle() {
		return pubcycle;
	}
	public void setPubcycle(String pubcycle) {
		this.pubcycle = pubcycle;
	}
	public String getPubplace() {
		return pubplace;
	}
	public void setPubplace(String pubplace) {
		this.pubplace = pubplace;
	}
	public String getPubhost() {
		return pubhost;
	}
	public void setPubhost(String pubhost) {
		this.pubhost = pubhost;
	}
	@Override
	public String toString() {
		return "MagazineHotDetail [id=" + id + ", journalname=" + journalname + ", CNnumber=" + CNnumber + ", ISSN="
				+ ISSN + ", postNumber=" + postNumber + ", pubcycle=" + pubcycle + ", pubplace=" + pubplace
				+ ", pubhost=" + pubhost + "]";
	}
}
