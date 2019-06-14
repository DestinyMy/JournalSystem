/**
 * 
 */
package com.f5.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.f5.pojo.MagazineSub;
import com.f5.pojo.User;
import com.f5.service.MagazineSubService;
import com.f5.service.UserService;

/**
 * <p>Title:AdminController.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��4��27��
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping("/index")
	public String index() {
		return "admin/index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "adminlogin";
	}
	
	@RequestMapping("/loginerr")
	public String loginerr(Model model) {
		model.addAttribute("error","Account not exist or wrong password!");
		return "adminlogin";
	}
	
	@Autowired
	private UserService userService=null;
	
	@RequestMapping("/adduser")
	public @ResponseBody
	Map<String,String> addUser(User user) {
		Map<String,String> map = userService.insertUser(user);
		return map;
	}
	
	
}
