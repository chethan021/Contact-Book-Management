package com.jsp.contactbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.contactbook.entity.User;
import com.jsp.contactbook.repo.userRepo;
@Service
public class UserService {
	@Autowired
	private userRepo repo;
	public ModelAndView saveUserRequest() {
		ModelAndView view = new ModelAndView("add-user.jsp");
		view.addObject("user",new User());
		return view;
	}
	public ModelAndView saveUser(User user) {
		repo.saveUser(user);
		return new ModelAndView("welcome.jsp");
	}
	public ModelAndView updateUserRequest(int userId) {
		User user = repo.getById(userId);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("update-user.jsp");
		mav.addObject(user);
		return mav;

	}
	public ModelAndView updateUser(User user) {
		repo.updateUser(user);
		return new ModelAndView("home.jsp");
	}

	public ModelAndView deleteUserRequest(int userId) {
		repo.deleteUserById(userId);
		return new ModelAndView("home.jsp");
	}
	
}

