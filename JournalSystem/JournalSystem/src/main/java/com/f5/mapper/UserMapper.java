/**
 * 
 */
package com.f5.mapper;

import org.springframework.stereotype.Repository;

import com.f5.pojo.User;

/**
 * <p>Title:UserMapper.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019Äê4ÔÂ25ÈÕ
 */
@Repository
public interface UserMapper {
	public User selectUserByUserName(String userName);
	public void insertUser(User user);
	public User selectUserByID(String id);
}
