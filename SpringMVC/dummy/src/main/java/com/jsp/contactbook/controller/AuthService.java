package com.jsp.contactbook.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.contactbook.dto.LoginDto;
import com.jsp.contactbook.entity.User;
import com.jsp.contactbook.repo.userRepo;
@Service
public class AuthService {
	@Autowired
	userRepo repo;
	public ModelAndView login(LoginDto logindto, HttpSession session) {
		User user = repo.getUserByEmail(logindto.getEmail());
		ModelAndView modelAndView=new ModelAndView("user-profile.jsp");
		if(user!=null) {
			if(user.getPassword().equals(logindto.getPassword())) {
				System.out.println("userpass db " +user.getPassword());
				System.out.println("logindto  ui" +logindto.getPassword());
				session.setAttribute("user",user);
				return modelAndView;
			}
			else
				{
				System.out.println("CAME FOR ELSE");
				modelAndView.addObject("error","incorrect password please login");
				return modelAndView;
				}
		}

		modelAndView.addObject("error","Your not User pls SignUp");
		return modelAndView;
	}
	public ModelAndView loginForm() {
		return new ModelAndView("welcome.jsp").addObject("login",new LoginDto());

	}
	public ModelAndView logout(LoginDto logindto, HttpSession session) {
		session.invalidate();
		return new ModelAndView("welcome.jsp");
	}

}
