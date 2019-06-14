package com.f5.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5.mapper.MagazineHotMapper;
import com.f5.pojo.MagazineHot;
import com.f5.service.MagazineHotService;

@Service
public class MagazineHotServiceImpl implements MagazineHotService {

	@Autowired
	private MagazineHotMapper magazineHotMapper = null;
	
	public List<MagazineHot> selectTopThree() {
		List<MagazineHot> msList = magazineHotMapper.selectTopThree();
		return msList;
	}
}
