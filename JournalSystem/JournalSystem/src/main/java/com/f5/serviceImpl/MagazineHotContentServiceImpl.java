package com.f5.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5.mapper.MagazineHotContentMapper;
import com.f5.pojo.MagazineHotContent;
import com.f5.service.MagazineHotContentService;

@Service
public class MagazineHotContentServiceImpl implements MagazineHotContentService {

	@Autowired
	private MagazineHotContentMapper magazineHotContentMapper = null;
	
	public MagazineHotContent selectMagazineHotByID(Integer id) {
		MagazineHotContent mc = magazineHotContentMapper.selectMagazineHotByID(id);
		return mc;
	}

}
