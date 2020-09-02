package com.gura.corona.cafe.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.corona.cafe.dto.CafeDto;

@Repository
public class CafeDaoImpl implements CafeDao{
	@Autowired
	private SqlSession session;
	
	//카페글 목록 보기
	@Override
	public List<CafeDto> getList() {
		
		List<CafeDto> list=session.selectList("cafe.getList");
		return list;
	}

	//카페글 삽입
	@Override
	public void insert(CafeDto dto) {
		
		session.insert("cafe.insert",dto);
		
	}
}
