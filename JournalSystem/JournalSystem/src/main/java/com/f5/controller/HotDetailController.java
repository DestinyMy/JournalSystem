package com.f5.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.f5.pojo.*;
import com.f5.service.*;
@Controller
public class HotDetailController {

	@Autowired
	private MagazineHotDetailService magazineHotDetailService = null;
	
	@Autowired
	private MagazineHotDetailService1 magazineHotDetailService1 = null;
	
	@Autowired
	private MagazineHotContentService magazineHotContentService = null;
	
	@RequestMapping("/magazinehotdetailid/{id}")
	public String getmagazine() {
		return "magazinehotdetailid";
	}
	
	@RequestMapping("/magazinehotcontent/{regid}")
	public @ResponseBody
	Map<String, MagazineHotContent> getmagazinecontent(@PathVariable("regid") Integer regid) {
		Map<String,MagazineHotContent> msMap = new HashMap<String, MagazineHotContent>();
		msMap.put("magazinehotcontent", magazineHotContentService.selectMagazineHotByID(regid));
		return msMap;
	}
	
	@RequestMapping("/magazinehotdetail")
	public @ResponseBody
	Map<String,List<MagazineHotDetail>> getMagazineHotDetail(String name){
		Map<String,List<MagazineHotDetail>> msMap = new HashMap<String, List<MagazineHotDetail>>();
		msMap.put("magazineHotDetail", magazineHotDetailService.selectMagazineHotDetail(name));
		return msMap;
	}
	
	@RequestMapping("/magazinehotdetaildo")
	public @ResponseBody
	Map<String,List<MagazineHotDetail1>> getMagazineHotDetail1(MagazineHotContent info){
		Map<String,List<MagazineHotDetail1>> msMap = new HashMap<String, List<MagazineHotDetail1>>();
		msMap.put("magazineHotDetail1", magazineHotDetailService1.selectMagazineHotDetail1(info));
		return msMap;
	}
}