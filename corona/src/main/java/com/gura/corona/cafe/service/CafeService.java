package com.gura.corona.cafe.service;

import javax.servlet.http.HttpServletRequest;

import com.gura.corona.cafe.dto.CafeDto;

public interface CafeService {
	public void getList (HttpServletRequest request);
	public void insert (CafeDto dto);
}
