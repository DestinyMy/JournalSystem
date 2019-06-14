package com.f5.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.f5.pojo.MagazineHot;

@Repository
public interface MagazineHotMapper {
	public List<MagazineHot> selectTopThree();
}
