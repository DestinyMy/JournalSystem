package com.f5.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.f5.pojo.BorrowItem;

@Repository
public interface BorrowMapper {
	public void insertBorrowItem(BorrowItem borrowItem);
	public List<BorrowItem> borrowDocByUserid(String userid);
	public void updateState(@Param("id") int id,@Param("state")int state);
	public List<BorrowItem> searchBorrow();
}
