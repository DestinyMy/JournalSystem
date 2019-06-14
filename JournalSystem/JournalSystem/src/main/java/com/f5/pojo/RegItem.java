/**
 * 
 */
package com.f5.pojo;

/**
 * <p>Title:RegItem.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��5��19��
 */
public class RegItem {
	private int id;
	private String journalName;
	private int pubyear ;
	private int pubvolume ;
	private int pubphase ;
	private int pubnumer;
	private int pubbor;
	
	public int getPubbor() {
		return pubbor;
	}
	public void setPubbor(int pubbor) {
		this.pubbor = pubbor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getPubnumer() {
		return pubnumer;
	}
	public void setPubnumer(int pubnumer) {
		this.pubnumer = pubnumer;
	}
}
