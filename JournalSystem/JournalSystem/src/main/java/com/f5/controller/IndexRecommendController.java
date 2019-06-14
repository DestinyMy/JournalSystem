package com.f5.controller;

import java.util.*;
import com.f5.pojo.*;
import com.f5.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>Title:UserController.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��4��25��
 */
@Controller
public class IndexRecommendController {
	
	@Autowired
	private MagazineHotService magazineHotService = null;
	
	@RequestMapping("/magazine1")
	public String magazine1() {
		return "magazine1";
	}
	
	@RequestMapping("/magazine2")
	public String magazine2() {
		return "magazine2";
	}
	
	@RequestMapping("/magazine3")
	public String magazine3() {
		return "magazine3";
	}
	
	@RequestMapping("/magazine4")
	public String magazine4() {
		return "magazine4";
	}
	
	@RequestMapping("/magazine5")
	public String magazine5() {
		return "magazine5";
	}
	
	@RequestMapping("/magazine6")
	public String magazine6() {
		return "magazine6";
	}
	
	@RequestMapping("/hotmagazine")
	public @ResponseBody 
	Map<String, List<MagazineHot>> hotmagazine() {
		Map<String, List<MagazineHot>> msMap= new HashMap<String, List<MagazineHot>>();
		msMap.put("hotmagazine", magazineHotService.selectTopThree());
		return msMap;
	}
}