package com.f5.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.f5.pojo.MagazineHotContent;
import com.f5.pojo.MagazineHotDetail1;

@Repository
public interface MagazineHotDetailMapper1 {
	public List<MagazineHotDetail1> selectMagazineHotDetail1(MagazineHotContent info);
}