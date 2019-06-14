package com.f5.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.f5.pojo.BorrowItem;
import com.f5.service.BorrowService;

@Controller
public class BorrowController {
	
	@Autowired
	private BorrowService borrowService = null;
	
	@RequestMapping("/magazineborrow")
	public @ResponseBody 
	Map<String,String> index(String userid ,int regid) {
		Map<String,String> map = borrowService.borrowMagazine(userid, regid);
		return map;
	}
	@RequestMapping("/borrowlog")
	private @ResponseBody 
	Map<String,List<BorrowItem>> borrowDoc(String userid){
		Map<String,List<BorrowItem>> map = new HashMap<String,List<BorrowItem>>();
		map.put("borrowDoc",borrowService.borrowDocByUserId(userid));
		return map;
	}
	
	/**
	 *  还书
	 */
	@RequestMapping("/doback")
	public @ResponseBody 
	Map<String,String> doBack(int id){
		Map<String,String> map = new HashMap<String,String>();
		borrowService.updateState(id, 1);
		map.put("info","success");
		return map;
	}
	@RequestMapping("/searchborrow")
	public @ResponseBody  
	Map<String,List<BorrowItem>> searchBorrow(){
		return borrowService.searchBorrow();
	}
	
	@RequestMapping("/verifyback")
	public @ResponseBody 
	Map<String,String> verifyback(int id){
		Map<String,String> map = new HashMap<String,String>();
		borrowService.updateState(id, 2);
		map.put("info","success");
		return map;
	}
}
