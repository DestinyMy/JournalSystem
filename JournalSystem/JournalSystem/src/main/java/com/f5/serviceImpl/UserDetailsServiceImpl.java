/**
 * 
 */
package com.f5.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.f5.service.UserService;

/**
 * <p>Title:UserDetailsServiceImpl.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019Äê4ÔÂ25ÈÕ
 */
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService=null;
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.f5.pojo.User user = userService.selectUserByID(username);
		if(user==null)
			return null;
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return new User(username, user.getPassword(), authorities );
	}

}