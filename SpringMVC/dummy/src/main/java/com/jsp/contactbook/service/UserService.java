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
		User userByEmail = repo.getUserByEmail(user.getUserEmail());
		if(userByEmail==null)
		{
			repo.saveUser(user);
			return new ModelAndView("welcome.jsp");
		}
		else return new ModelAndView("new-user-error.jsp").addObject("usermail", userByEmail);
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
		return new ModelAndView("welcome.jsp");
	}
//	public ModelAndView updatePasswordRequest(String userEmail) {
//		return new ModelAndView("forgotpass.jsp").addObject("Email", userEmail);
//	}
	public ModelAndView updatePass(String userEmail, String password) {
		
		repo.updatePass(userEmail,password);
		
		 return new ModelAndView("welcome.jsp");
	}
	public ModelAndView updatePasswordRequest() {
		return new ModelAndView("forgotpass.jsp");
	}

}

