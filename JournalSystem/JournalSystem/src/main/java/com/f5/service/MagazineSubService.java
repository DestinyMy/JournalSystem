/**
 * 
 */
package com.f5.service;

import java.util.List;
import java.util.Map;

import com.f5.pojo.MagazineSub;

/**
 * <p>Title:MagazineSubService.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��4��27��
 */
public interface MagazineSubService {
	public Map<String,String> insertMagazineSub(MagazineSub ms);
	public List<MagazineSub> selectAllMagazineSub();
	public void deleteMagazineSub(Long id);
	
}
