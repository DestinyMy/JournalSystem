/**
 * 
 */
package com.f5.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.f5.pojo.RegItem;

/**
 * <p>Title:MagazineRegMapper.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��5��19��
 */
@Repository
public interface MagazineRegMapper {
	public void insertRegItem(RegItem regItem);
	public RegItem selectRegItem(int id);
	public void updateRegItem(@Param("id")int id,@Param("pubbor")int pubbor);
	public List<RegItem> selectLikeName(String journalName);
	public List<RegItem> selectAllRegItem();
}
