/**
 * 
 */
package com.f5.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5.mapper.UserMapper;
import com.f5.pojo.User;
import com.f5.service.UserService;

/**
 * <p>Title:UserServiceImpl.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��4��25��
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User selectUserByID(String id) {
		
		return userMapper.selectUserByID(id);	
	}

	public Map<String,String> insertUser(User user) {
		User u = userMapper.selectUserByID(user.getId());
		Map<String,String> remindMap = new HashMap<String,String>();
		if(u!=null) {
			remindMap.put("isSuccess", "false");
			remindMap.put("error", "�û����ظ�");
			return remindMap;
		}
		userMapper.insertUser(user);
		remindMap.put("isSuccess", "true");
		return remindMap;
	}

}
