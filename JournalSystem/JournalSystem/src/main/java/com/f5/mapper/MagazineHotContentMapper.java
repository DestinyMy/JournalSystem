package com.f5.mapper;

import org.springframework.stereotype.Repository;

import com.f5.pojo.MagazineHotContent;

@Repository
public interface MagazineHotContentMapper {
	public MagazineHotContent selectMagazineHotByID(Integer id);
}
