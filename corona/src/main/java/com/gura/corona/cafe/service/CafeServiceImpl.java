package com.gura.corona.cafe.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gura.corona.cafe.dao.CafeDao;
import com.gura.corona.cafe.dto.CafeDto;

@Service
public class CafeServiceImpl implements CafeService{
	@Autowired
	private CafeDao cafedao;

	@Override
	public void getList(HttpServletRequest request) {
		
		List<CafeDto> list=cafedao.getList();
		request.setAttribute("list", list);
	}

	@Override
	public void insert(CafeDto dto) {
		cafedao.insert(dto);
		
	}
}
