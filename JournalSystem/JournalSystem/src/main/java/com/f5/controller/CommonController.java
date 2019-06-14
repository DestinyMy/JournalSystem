/**
 * 
 */
package com.f5.controller;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title:CommonController.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��4��27��
 */
@Controller
public class CommonController {

	@RequestMapping("/index")
	public String index(HttpServletRequest request,HttpServletResponse reponse) {
		HttpSession session = request.getSession();
		SecurityContext attribute = (SecurityContext)session.getAttribute("SPRING_SECURITY_CONTEXT");
		if(attribute==null)
			return "index";
		UserDetails principal = (UserDetails)attribute.getAuthentication().getPrincipal();
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie:cookies) {
			if("user".equals(cookie.getName()))
				return "index";
		}
		Cookie cookie = new Cookie("user",principal.getUsername());
		reponse.addCookie(cookie);
		
		return "index";
	}
}
