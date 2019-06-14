package com.f5.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5.mapper.MagazineDetailsMapper;
import com.f5.mapper.MagazineRegMapper;
import com.f5.pojo.DetailItem;
import com.f5.pojo.MenuItem;
import com.f5.pojo.RegItem;
import com.f5.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private MagazineRegMapper magazineRegMapper = null;
	
	public Map<String, List<RegItem>> doSearch(String text) {
		
		Map<String,List<RegItem>> map = new HashMap<String,List<RegItem>>();
		List<RegItem> selectLikeName = magazineRegMapper.selectLikeName(text);
		map.put("outcome",selectLikeName);
		return map;
	}
	@Autowired
	private MagazineDetailsMapper magazineDetailsMapper = null;

	public Map<String, List<DetailItem>> doSearchfromDetail(int theme, String text) {
		Map<String,List<DetailItem>> map = new HashMap<String,List<DetailItem>>();
		//根据作者进行查询
		if(theme==2) {
			map.put("outcome",magazineDetailsMapper.doSearchfromDetailByAuthor(text));
		}
		else if(theme==3) {
			map.put("outcome",magazineDetailsMapper.doSearchfromDetailByKeyword(text));
		}
		return map;
	}

}
