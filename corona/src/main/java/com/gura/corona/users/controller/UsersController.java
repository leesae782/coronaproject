package com.gura.corona.users.controller;


import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.corona.users.service.UsersService;
import com.gura.corona.users.dto.UsersDto;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	//회원가입 폼
	@RequestMapping("/users/signup_form.do")
	public String signupForm() {
		
		return "users/signup_form";
	}
	
	//회원가입
	@RequestMapping("/users/signup")
	public ModelAndView signup(UsersDto dto, ModelAndView mView) {
		service.addUser(dto);
		mView.setViewName("users/signup");
		return mView;
	}
	
	@RequestMapping("/users/loginform")
	public String loginform(HttpServletRequest request) {
		// url 파라미터가 넘어오는지 읽어와 보기 
		String url=request.getParameter("url");
		if(url==null){//목적지 정보가 없다면
			String cPath=request.getContextPath();
			url=cPath+"/home.do"; //로그인후 인덱스 페이지로 가도록 하기 위해 
		}
		//request 에 담는다. 
		request.setAttribute("url", url);
		return "users/loginform";
	}
	
	@RequestMapping("/users/login")
	public ModelAndView login(UsersDto dto, ModelAndView mView,
			HttpSession session, HttpServletRequest request) {
		//로그인후 가야하는 목적지 정보
		String url=request.getParameter("url");
		//목적지 정보도 미리 인코딩 해 놓는다.
		String encodedUrl=URLEncoder.encode(url);
		//view  페이지에 전달하기 위해 ModelAndView 객체에 담아준다. 
		mView.addObject("url", url);
		mView.addObject("encodedUrl", encodedUrl);
		
		//service 객체를 이용해서 로그인 관련 처리를 한다.
		service.loginProcess(dto, mView, session);
		mView.setViewName("users/login");
		return mView;
	}
}
