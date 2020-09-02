package com.gura.corona.cafe.dao;

import java.util.List;

import com.gura.corona.cafe.dto.CafeDto;

public interface CafeDao {

	public List<CafeDto> getList();
	public void insert(CafeDto dto);
	public CafeDto getData(int num);
	public void delete(int num);
	public void addviewCount(int num);
	public void update(CafeDto dto);
}
