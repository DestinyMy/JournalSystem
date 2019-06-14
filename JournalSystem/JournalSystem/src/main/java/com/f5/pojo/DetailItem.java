/**
 * 
 */
package com.f5.pojo;

/**
 * <p>Title:DetailItem.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��5��21��
 */
public class DetailItem {
	private String journalName;
	private int pubyear;
	private int pubvolume ;
	private int pubphase ;
	private String papertitle; 
	private String paperauthor; 
	private String paperkeyword; 
	private int paperpagestart; 
	private int paperpageend;
	private int regid;
	
	
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getJournalName() {
		return journalName;
	}
	public void setJournalName(String journalName) {
		this.journalName = journalName;
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
	
	
	
}
