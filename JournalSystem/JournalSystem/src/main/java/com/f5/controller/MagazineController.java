package com.f5.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.f5.pojo.DetailItem;
import com.f5.pojo.MagazineSub;
import com.f5.pojo.MenuItem;
import com.f5.pojo.RegItem;
import com.f5.service.MagazineDetailsService;
import com.f5.service.MagazineMenuService;
import com.f5.service.MagazineRegService;
import com.f5.service.MagazineSubService;

/**
 * <p>Title:MagazineController.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��4��27��
 */
@Controller
@RequestMapping("/magazine")
public class MagazineController {

	@Autowired
	private MagazineSubService magazineSubService = null;
	
	@RequestMapping("/addmagazinesub")
	public @ResponseBody
	Map<String,String> addMagazineSub(MagazineSub ms){
		Map<String,String> map = magazineSubService.insertMagazineSub(ms);
		return map;
	}
	
	@RequestMapping("/magazinesublist")
	public @ResponseBody
	Map<String,List<MagazineSub>> getMsList(){
		Map<String,List<MagazineSub>> msMap = new HashMap<String, List<MagazineSub>>();
		msMap.put("journallist", magazineSubService.selectAllMagazineSub());
		return msMap;
	}
	
	@RequestMapping("/deleteJournalsub")
	public @ResponseBody
	String deleteJournalsub(Long id) {
		System.out.println(id);
		magazineSubService.deleteMagazineSub(id);
		return "success";
	}
	
	/*
	 * �鿴�ڿ���Ŀ¼���Ƿ����
	 */
	@Autowired
	public MagazineMenuService magazineMenuService = null;
	
	@RequestMapping("/existInMenu")
	public @ResponseBody
	String existInMenu(String journalName) {
		Boolean isExist = magazineMenuService.isExistInMenu(journalName);
		return isExist.toString();
	}
	
	@RequestMapping("/selectMenu")
	public @ResponseBody
	Map<String,MenuItem> selectMenu(String journalName){
		Map<String, MenuItem> selectMenu = magazineMenuService.selectMenu(journalName);
		return selectMenu;
	}
	
	@RequestMapping("/addJournalMenu")
	public @ResponseBody
	Map<String,String> addJournalMenu(MenuItem menuItem){
		Map<String,String> map = new HashMap<String,String>();
		magazineMenuService.insertMenuItem(menuItem);
		return map;
	}
	
	@Autowired
	private MagazineRegService magazineRegService = null;
	
	@RequestMapping("/addJournalReg")
	public @ResponseBody
	Map<String,String> addJournalReg(RegItem regItem){
		int regid = magazineRegService.insertRegItem(regItem);
		Map<String,String> map = new HashMap<String,String>();
		map.put("regid", ""+regid);
		return map;
	}
	
	@Autowired
	private MagazineDetailsService magazineDetailsService;
	
	@RequestMapping("/addJournalDetail")
	public @ResponseBody
	Map<String,String> addJournalDetail(DetailItem detailItem){
		magazineDetailsService.insertDetailItem(detailItem);
		Map<String,String> map = new HashMap<String,String>();
		return map;
	}
	
	@RequestMapping("/selectAllRegItem")
	public @ResponseBody
	Map<String,List<RegItem>> selectAllRegItem (){
		return magazineRegService.selectAllRegItem();
	}
}
