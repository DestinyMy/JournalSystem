package com.f5.pojo;

public class MagazineHotDetail1 {
	private int id;
	private String journalname;
	private int pubyear;
	private int pubvolume;
	private int pubphase;
	private String papertitle;
	private String paperauthor;
	private String paperkeyword;
	private int paperpagestart;
	private int paperpageend;
	private int regid;
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
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
	public String getPapertitle() {
		return papertitle;
	}
	public void setPapertitle(String papertitle) {
		this.papertitle = papertitle;
	}
	public String getPaperauthor() {
		return paperauthor;
	}
	public void setPaperauthor(String paperauthor) {
		this.paperauthor = paperauthor;
	}
	public String getPaperkeyword() {
		return paperkeyword;
	}
	public void setPaperkeyword(String paperkeyword) {
		this.paperkeyword = paperkeyword;
	}
	public int getPaperpagestart() {
		return paperpagestart;
	}
	public void setPaperpagestart(int paperpagestart) {
		this.paperpagestart = paperpagestart;
	}
	public int getPaperpageend() {
		return paperpageend;
	}
	public void setPaperpageend(int paperpageend) {
		this.paperpageend = paperpageend;
	}
	@Override
	public String toString() {
		return "MagazineHotDetail1 [id=" + id + ", journalname=" + journalname + ", pubyear=" + pubyear + ", pubvolume="
				+ pubvolume + ", pubphase=" + pubphase + ", papertitle=" + papertitle + ", paperauthor=" + paperauthor
				+ ", paperkeyword=" + paperkeyword + ", paperpagestart=" + paperpagestart + ", paperpageend="
				+ paperpageend + "]";
	}
	
}
