package com.jsp.contactbook.controller;


import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.contactbook.dto.LoginDto;
@Controller
public class AuthController {
	@Autowired
	AuthService authService;
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView login(LoginDto logindto,HttpSession session) {
		return authService.login(logindto,session);

	}
	@RequestMapping(path="/login",method = RequestMethod.GET)
	public ModelAndView loginRequest() {
		return authService.loginForm();
	}
	@RequestMapping(path = "/logout", method=RequestMethod.GET)
		public ModelAndView logout(LoginDto logindto,HttpSession session) {
			return authService.logout(logindto,session);

		}
	}


