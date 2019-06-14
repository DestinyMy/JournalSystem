/**
 * 
 */
package com.f5.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5.mapper.MagazineMenuMapper;
import com.f5.pojo.MenuItem;
import com.f5.service.MagazineMenuService;

/**
 * <p>Title:MagazineMenuServiceImpl.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��5��18��
 */
@Service
public class MagazineMenuServiceImpl implements MagazineMenuService{

	@Autowired
	public MagazineMenuMapper magazineMenuMapper = null;
	
	public boolean isExistInMenu(String journalName) {
		int jounalCount = magazineMenuMapper.isExistInMenu(journalName);
		if(jounalCount>=1)
			return true;
		return false;
	}
	public void insertMenuItem(MenuItem menuItem) {
		System.out.println("���");
		magazineMenuMapper.insertMenuItem(menuItem);
	}
	public Map<String, MenuItem> selectMenu(String journalName) {
		Map<String,MenuItem> map = new HashMap<String, MenuItem>();
		MenuItem menuItem = magazineMenuMapper.selectMenu(journalName);
		map.put("menuitem",menuItem);
		return map;
	}

}
