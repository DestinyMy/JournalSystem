package com.f5.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.f5.pojo.DetailItem;
import com.f5.pojo.RegItem;
import com.f5.service.SearchService;

@Controller
public class SearchController {

	@RequestMapping("/searchPage")
	public String searchPage() {
		return "search";
	}
	@Autowired
	private SearchService searchService = null;
	
	@RequestMapping("/doSearchbyMagname")
	public @ResponseBody
	Map<String,List<RegItem>> doSearchbyMagname(String text){
		Map<String,List<RegItem>> map = searchService.doSearch(text);
		return map;
	}
	
	@RequestMapping("/doSearchfromDetail")
	public @ResponseBody 
	Map<String, List<DetailItem>> doSearchfromDetail(int theme,String text){
		//根据作者查找
		return searchService.doSearchfromDetail(theme, text);
		
	}
}
