package com.f5.pojo;

public class MagazineHotContent {
	private String journalname;
	private int pubyear;
	private int pubvolume;
	private int pubphase;

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
	@Override
	public String toString() {
		return "MagazineHotContent [journalname=" + journalname + ", pubyear=" + pubyear + ", pubvolume=" + pubvolume
				+ ", pubphase=" + pubphase + "]";
	}
	
	
}
