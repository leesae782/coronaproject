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

	@Override
	public void getData(HttpServletRequest request) {
		int num=Integer.parseInt(request.getParameter("num"));
		cafedao.addviewCount(num);
		request.setAttribute("dto", cafedao.getData(num));
	}

	@Override
	public void delete(HttpServletRequest request) {
		int num=Integer.parseInt(request.getParameter("num"));
		
		cafedao.delete(num);
		
	}

	@Override
	public void update(CafeDto dto) {
		cafedao.update(dto);
		
	}
}
