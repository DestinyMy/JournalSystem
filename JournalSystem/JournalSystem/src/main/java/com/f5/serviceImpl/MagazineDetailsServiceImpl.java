/**
 * 
 */
package com.f5.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f5.mapper.MagazineDetailsMapper;
import com.f5.pojo.DetailItem;
import com.f5.service.MagazineDetailsService;

/**
 * <p>Title:MagazineDetailsServiceImpl.java</P>
 * <p>Description</P>
 * @author ACER
 * @date 2019Äê5ÔÂ21ÈÕ
 */
@Service
public class MagazineDetailsServiceImpl implements MagazineDetailsService {

	@Autowired
	private MagazineDetailsMapper magazineDetailsMapper;
	
	public void insertDetailItem(DetailItem detailItem) {
		magazineDetailsMapper.insertDetailItem(detailItem);
	}

}
