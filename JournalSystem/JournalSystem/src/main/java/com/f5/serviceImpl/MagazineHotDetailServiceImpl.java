package com.f5.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5.mapper.MagazineHotDetailMapper;
import com.f5.pojo.MagazineHotDetail;
import com.f5.service.MagazineHotDetailService;

@Service
public class MagazineHotDetailServiceImpl implements MagazineHotDetailService {
	
	@Autowired
	private MagazineHotDetailMapper magazineHotDetailMapper = null;
	
	public List<MagazineHotDetail> selectMagazineHotDetail(String name) {
		List<MagazineHotDetail> msList = magazineHotDetailMapper.selectMagazineHotDetail(name);
		return msList;
	}
}
