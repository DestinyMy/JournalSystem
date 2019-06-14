/**
 * 
 */
package com.f5.pojo;

/**
 * <p>Title:User.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019Äê4ÔÂ25ÈÕ
 */
public class User {
	private String id;
	private String userName;
	private String password;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]";
	}
	
	
}
