/**
 * 
 */
package com.f5.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5.mapper.MagazineSubMapper;
import com.f5.pojo.MagazineSub;
import com.f5.service.MagazineSubService;

/**
 * <p>Title:MagazineSubServiceImpl.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019Äê4ÔÂ27ÈÕ
 */
@Service
public class MagazineSubServiceImpl implements MagazineSubService {

	@Autowired
	private MagazineSubMapper magazineSubMapper = null;
	
	public Map<String, String> insertMagazineSub(MagazineSub ms) {
		magazineSubMapper.insertMagazineSub(ms);
		Map<String,String> map = new HashMap<String,String>();
		map.put("isSuccess", "true");
		return map;
	}

	
	public List<MagazineSub> selectAllMagazineSub() {
		List<MagazineSub> msList = magazineSubMapper.selectAllMagazineSub();
		return msList;
	}

	public void deleteMagazineSub(Long id) {
		magazineSubMapper.deleteMagazineSub(id);	
	}

}
