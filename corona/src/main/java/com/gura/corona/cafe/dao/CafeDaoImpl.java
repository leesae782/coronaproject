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

	@Override
	public CafeDto getData(int num) {
		
		CafeDto dto = session.selectOne("cafe.getData",num);
		return dto;
	}

	@Override
	public void delete(int num) {
		session.delete("cafe.delete",num);
		
	}

	@Override
	public void addviewCount(int num) {
		session.update("cafe.addviewCount",num);
		
	}

	@Override
	public void update(CafeDto dto) {
		session.update("cafe.update",dto);
		
	}
}
