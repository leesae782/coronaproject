package com.gura.corona.cafe.dao;

import java.util.List;

import com.gura.corona.cafe.dto.CafeDto;

public interface CafeDao {

	public List<CafeDto> getList(CafeDto dto);
	public void insert(CafeDto dto);
	public CafeDto getData(int num);
	public void delete(int num);
	public void addviewCount(int num);
	public void update(CafeDto dto);
	public int getCount(CafeDto dto);
	//키워드를 활용한 글정보 얻어오기
		public CafeDto getData(CafeDto dto);
}
