package com.f5.service;

import java.util.List;
import java.util.Map;

import com.f5.pojo.BorrowItem;

public interface BorrowService {
	
	public Map<String,String> borrowMagazine(String userid,int regid);
	public List<BorrowItem> borrowDocByUserId(String userid);
	public void updateState(int id,int state);//还书
	public Map<String,List<BorrowItem>> searchBorrow();
}
