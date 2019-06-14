/**
 * 
 */
package com.f5.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.f5.pojo.User;
import com.f5.service.UserService;

/**
 * <p>Title:UserController.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��4��25��
 */
@Controller
public class UserController {

	@RequestMapping("/user/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/user/loginerr")
	public String loginerr(Model model) {
		model.addAttribute("error","Wrong message!");
		return "login";
	}
	
	@Autowired
	private UserService userService = null;
	
	@RequestMapping("/user/info")
	public @ResponseBody 
	Map<String,String> userinfo(String id){
		User user = userService.selectUserByID(id);
		Map<String,String> map = new HashMap<String,String>();
		map.put("userName",user.getUserName());
		return map;
	}
}
