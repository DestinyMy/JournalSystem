/**
 * 
 */
package com.f5.mapper;

import org.springframework.stereotype.Repository;

import com.f5.pojo.MenuItem;

/**
 * <p>Title:MagazineMenu.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��5��18��
 */
@Repository
public interface MagazineMenuMapper {
	public int isExistInMenu(String journalName);
	public void insertMenuItem(MenuItem menuItem);
	public MenuItem selectMenu(String journalName);
}
