package com.f5.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.f5.mapper.BorrowMapper;
import com.f5.mapper.MagazineRegMapper;
import com.f5.mapper.UserMapper;
import com.f5.pojo.BorrowItem;
import com.f5.pojo.RegItem;
import com.f5.pojo.User;
import com.f5.service.BorrowService;
import com.f5.service.UserService;

@Service
public class BorrowServiceImpl implements BorrowService {
	
	@Autowired
	private MagazineRegMapper magazineRegMapper = null;
	@Autowired
	private BorrowMapper borrowMapper = null;
	
	@Autowired
	private UserMapper userMapper = null;
	
	public Map<String, String> borrowMagazine(String userid,int regid) {
		//查看所借的书是否还有库存，如果有更新库存
		RegItem regItem = magazineRegMapper.selectRegItem(regid);
		Map<String,String> map = new HashMap<String,String>();
		if(regItem.getPubbor() >= regItem.getPubnumer()) {
			map.put("info", "本书无库存");
			return map;
		}
		magazineRegMapper.updateRegItem(regid, regItem.getPubbor()+1);
		//获取用户信息
		User user = userMapper.selectUserByID(userid);
		//插入借阅数据
		BorrowItem borrowItem = new BorrowItem();
		borrowItem.setUserid(userid);
		borrowItem.setJournalname(regItem.getJournalName());
		borrowItem.setPubyear(regItem.getPubyear());
		borrowItem.setPubvolume(regItem.getPubvolume());
		borrowItem.setPubphase(regItem.getPubphase());
		borrowItem.setRegid(regItem.getId());
		borrowItem.setState(0);
		borrowItem.setUsername(user.getUserName());
		borrowMapper.insertBorrowItem(borrowItem);
		map.put("info","借阅成功");
		return map;
	}

	public List<BorrowItem> borrowDocByUserId(String userid) {
		List<BorrowItem> list = borrowMapper.borrowDocByUserid(userid);
		return list;
	}

	public void updateState(int id, int state) {
		borrowMapper.updateState(id,state);
	}
	
	public Map<String,List<BorrowItem>> searchBorrow(){
		List<BorrowItem> searchBorrow = borrowMapper.searchBorrow();
		Map<String,List<BorrowItem>> map = new HashMap<String,List<BorrowItem>>();
		map.put("borrowreg",searchBorrow);
		return map;
	}


}
