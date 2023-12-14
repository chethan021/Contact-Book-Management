package com.jsp.contactbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.jsp.contactbook.entity.Contact;
import com.jsp.contactbook.entity.User;
import com.jsp.contactbook.repo.ContactRepo;
@Service
public class ContactService {
	@Autowired
	ContactRepo cRepo;
	public ModelAndView saveContactRequest() {
		ModelAndView view = new ModelAndView("add-contact.jsp");
		view.addObject("contact",new Contact());
		return view;
	}


	public ModelAndView saveContact(Contact contact) {
		cRepo.saveContact(contact);
		return new ModelAndView("home.jsp");

	}


	public ModelAndView updateContactRequest(int contactId) {
		Contact contact = cRepo.getById(contactId);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("update-contact.jsp");
		mav.addObject(contact);
		return mav;

	}


	public ModelAndView updateContact(Contact contact) {
		cRepo.updateContact(contact);
		return new ModelAndView("home.jsp");
	}
}


