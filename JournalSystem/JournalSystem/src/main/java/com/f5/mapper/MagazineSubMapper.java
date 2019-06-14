/**
 * 
 */
package com.f5.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.f5.pojo.MagazineSub;

/**
 * <p>Title:MagazineSubMapper.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019Äê4ÔÂ27ÈÕ
 */
@Repository
public interface MagazineSubMapper {
	public void insertMagazineSub(MagazineSub ms);
	public List<MagazineSub> selectAllMagazineSub();
	public void deleteMagazineSub(Long id);
}
