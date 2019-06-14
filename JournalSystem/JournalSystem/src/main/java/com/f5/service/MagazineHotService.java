package com.f5.service;

import java.util.List;

import com.f5.pojo.MagazineHot;

public interface MagazineHotService {
	public List<MagazineHot> selectTopThree();
}
