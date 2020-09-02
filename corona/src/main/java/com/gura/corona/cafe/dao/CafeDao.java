package com.gura.corona.cafe.dao;

import java.util.List;

import com.gura.corona.cafe.dto.CafeDto;

public interface CafeDao {

	public List<CafeDto> getList();
	public void insert(CafeDto dto);
}
