/**
 * 
 */
package com.f5.pojo;

/**
 * <p>Title:MagazineSub.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019Äê4ÔÂ27ÈÕ
 */
public class MagazineSub {
	private Long id;
	private String postNumber;
	private String journalName;
	private String subscriptYear;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPostNumber() {
		return postNumber;
	}
	public void setPostNumber(String postNumber) {
		this.postNumber = postNumber;
	}
	public String getJournalName() {
		return journalName;
	}
	public void setJournalName(String journalName) {
		this.journalName = journalName;
	}
	public String getSubscriptYear() {
		return subscriptYear;
	}
	public void setSubscriptYear(String subscriptYear) {
		this.subscriptYear = subscriptYear;
	}
	@Override
	public String toString() {
		return "MagazineSub [id=" + id + ", postNumber=" + postNumber + ", journalName=" + journalName
				+ ", subscriptYear=" + subscriptYear + "]";
	}
	
}
