/**
 * 
 */
package com.f5.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5.mapper.MagazineRegMapper;
import com.f5.pojo.RegItem;
import com.f5.service.MagazineRegService;

/**
 * <p>Title:MagazineRegServiceImpl.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��5��19��
 */
@Service
public class MagazineRegServiceImpl implements MagazineRegService {

	@Autowired
	private MagazineRegMapper magazineRegMapper = null;
	
	public int insertRegItem(RegItem regItem) {
		magazineRegMapper.insertRegItem(regItem);
		return regItem.getId();
	}

	public Map<String, List<RegItem>> selectAllRegItem() {
		Map<String,List<RegItem>> map = new HashMap<String,List<RegItem>>();
		map.put("allreg",magazineRegMapper.selectAllRegItem());
		return map;
	}

}
