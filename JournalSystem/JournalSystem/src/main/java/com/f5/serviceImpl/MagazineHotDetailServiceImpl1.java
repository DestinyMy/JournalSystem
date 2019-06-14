package com.f5.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.f5.mapper.MagazineHotDetailMapper1;
import com.f5.pojo.MagazineHotContent;
import com.f5.pojo.MagazineHotDetail1;
import com.f5.service.MagazineHotDetailService1;

@Service
public class MagazineHotDetailServiceImpl1 implements MagazineHotDetailService1 {
	@Autowired
	private MagazineHotDetailMapper1 magazineHotDetailMapper1 = null;
	
	public List<MagazineHotDetail1> selectMagazineHotDetail1(MagazineHotContent info) {
		List<MagazineHotDetail1> msList = magazineHotDetailMapper1.selectMagazineHotDetail1(info);
		return msList;
	}
}
