/**
 * 
 */
package com.f5.service;

import java.util.Map;

import com.f5.pojo.MenuItem;

/**
 * <p>Title:MagazineMenuService.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��5��18��
 */
public interface MagazineMenuService {
	public boolean isExistInMenu(String journalName); 
	public void insertMenuItem(MenuItem menuItem);
	public Map<String,MenuItem> selectMenu(String journalName);
}
