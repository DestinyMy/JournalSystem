/**
 * 
 */
package com.f5.pojo;

/**
 * <p>Title:MenuItem.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019Äê5ÔÂ19ÈÕ
 */
public class MenuItem {
	
	
	private String journalName;
	private String cnnumber;
	private String issn;
	private String postNumber;
	private String pubcycle;
	private String pubplace;
	private String pubhost;
	
	public String getJournalName() {
		return journalName;
	}
	public void setJournalName(String journalName) {
		this.journalName = journalName;
	}
	public String getCnnumber() {
		return cnnumber;
	}
	public void setCnnumber(String cnnumber) {
		this.cnnumber = cnnumber;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
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
	public String getpubplace() {
		return pubplace;
	}
	public void setpubplace(String pubplace) {
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
		return "MenuItem [journalName=" + journalName + ", cnnumber=" + cnnumber + ", issn=" + issn + ", postNumber="
				+ postNumber + ", pubcycle=" + pubcycle + ", pubplace=" + pubplace + ", pubhost=" + pubhost
				;
	}
	

}
