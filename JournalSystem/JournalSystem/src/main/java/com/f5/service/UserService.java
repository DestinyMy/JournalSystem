/**
 * 
 */
package com.f5.service;

import java.util.Map;

import com.f5.pojo.User;

/**
 * <p>Title:UserService.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019Äê4ÔÂ25ÈÕ
 */
public interface UserService {
	public User selectUserByID(String id);
	public Map<String,String> insertUser(User user);
}
