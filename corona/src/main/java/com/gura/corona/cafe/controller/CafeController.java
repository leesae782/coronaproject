package com.gura.corona.cafe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gura.corona.cafe.dto.CafeDto;
import com.gura.corona.cafe.service.CafeService;

@Controller
public class CafeController {

	@Autowired
	private CafeService cafeService;
	
	
	@RequestMapping("/cafe/list.do")
	public String getList(HttpServletRequest request) {
		
		cafeService.getList(request);
		return "cafe/list";
	}
	
	@RequestMapping("/cafe/private/insertform")
	public ModelAndView insertForm(ModelAndView mView) {
		
		mView.setViewName("cafe/private/insertform");
		return mView;
	}
	
	@RequestMapping(value = "/cafe/private/insert", method=RequestMethod.POST)
	public ModelAndView insert(CafeDto dto, ModelAndView mView, HttpSession session) {
		//dto 에 글 작성자 담기 
		String id=(String)session.getAttribute("id");
		dto.setWriter(id);
		cafeService.insert(dto);
		mView.setViewName("cafe/private/insert");
		return mView;
	}
	
	@RequestMapping("/cafe/detail.do")
	public ModelAndView detail(ModelAndView mView, HttpServletRequest request) {
		
		cafeService.getData(request);
		mView.setViewName("cafe/detail");
		return mView;
	}
	@RequestMapping("/cafe/private/delete.do")
	public String delete(HttpServletRequest request) {
		cafeService.delete(request);
		return "redirect:/cafe/list.do";
	}
	
	@RequestMapping("/cafe/private/updateform.do")
	public ModelAndView updateform(ModelAndView mView, HttpServletRequest request) {
		
		cafeService.getData(request);
		mView.setViewName("cafe/private/updateform");
		return mView;
	}
	@RequestMapping("/cafe/private/update.do")
	public ModelAndView update(ModelAndView mView, CafeDto dto) {
		
		cafeService.update(dto);
		mView.setViewName("cafe/private/update");
		return mView;
	}
	
}
