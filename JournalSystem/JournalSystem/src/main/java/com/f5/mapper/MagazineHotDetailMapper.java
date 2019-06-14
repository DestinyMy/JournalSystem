package com.f5.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.f5.pojo.MagazineHotDetail;

@Repository
public interface MagazineHotDetailMapper {
	public List<MagazineHotDetail> selectMagazineHotDetail(@Param("name") String name);
}
