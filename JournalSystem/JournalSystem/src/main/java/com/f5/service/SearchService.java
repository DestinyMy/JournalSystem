package com.f5.service;

import java.util.List;
import java.util.Map;

import com.f5.pojo.DetailItem;
import com.f5.pojo.MenuItem;
import com.f5.pojo.RegItem;

public interface SearchService {

	public Map<String, List<RegItem>> doSearch(String text);
	public Map<String,List<DetailItem>> doSearchfromDetail(int theme,String text);
}
