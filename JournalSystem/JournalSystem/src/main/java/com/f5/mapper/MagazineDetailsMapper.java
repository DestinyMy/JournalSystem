/**
 * 
 */
package com.f5.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.f5.pojo.DetailItem;

/**
 * <p>Title:MagazineDetailsMapper.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019��5��21��
 */
@Repository
public interface MagazineDetailsMapper {
	public void insertDetailItem(DetailItem detailItem);
	public List<DetailItem> doSearchfromDetailByAuthor(String paperauthor);
	public List<DetailItem> doSearchfromDetailByKeyword(String keyword);
}
