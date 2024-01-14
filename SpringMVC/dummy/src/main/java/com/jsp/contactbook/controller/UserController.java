package com.jsp.contactbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.contactbook.entity.User;
import com.jsp.contactbook.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(path="/add-user",method =RequestMethod.GET)
	public ModelAndView saveUserRequest() {
		return userService.saveUserRequest();
	}
	@RequestMapping(path = "/add-user", method = RequestMethod.POST)
	public ModelAndView saveUSer(User user) {
		return userService.saveUser(user);
	}
	@RequestMapping(path="/update-user", method=RequestMethod.GET)  
	public ModelAndView updateUserRequest(@RequestParam int userId) {
		return userService.updateUserRequest(userId);
	}
	@RequestMapping(path="/update-user", method = RequestMethod.POST)
	public ModelAndView updateUser(User user) {
		return userService.updateUser(user);
	}
//	@RequestMapping(path="/updatepassword", method=RequestMethod.GET)  
//	public ModelAndView updatePasswordRequest(@RequestParam String email) {
//		return userService.updatePasswordRequest(email);
//	}
	@RequestMapping(path="/updatepassword", method = RequestMethod.POST)
	public ModelAndView updatePassword(@RequestParam String password,@RequestParam String userEmail) {
		return userService.updatePass(userEmail,password);
	}
	@RequestMapping(path="/updatepassword", method=RequestMethod.GET)  
	public ModelAndView updatePasswordRequest() {
		return userService.updatePasswordRequest();
	}
	@RequestMapping(path="/delete-user", method=RequestMethod.GET)
	public ModelAndView requestMethodName(@RequestParam int userId) {
		return userService.deleteUserRequest(userId);
	}
	

}
