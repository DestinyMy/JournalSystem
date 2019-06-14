/**
 * 
 */
package com.f5.service;

import java.util.List;
import java.util.Map;

import com.f5.pojo.RegItem;

/**
 * <p>Title:MagazineRegService.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��5��19��
 */
public interface MagazineRegService {
	public int insertRegItem(RegItem regItem);
	public Map<String,List<RegItem>> selectAllRegItem();
}
