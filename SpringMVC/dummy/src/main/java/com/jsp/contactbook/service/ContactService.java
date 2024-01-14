package com.jsp.contactbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.jsp.contactbook.entity.Contact;
import com.jsp.contactbook.entity.User;
import com.jsp.contactbook.repo.ContactRepo;
import com.jsp.contactbook.repo.userRepo;
@Service
public class ContactService {
	@Autowired
	ContactRepo cRepo;
	@Autowired
	Contact c;
	@Autowired
	userRepo ur;
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
		mav.addObject("contact",contact);
		return mav;

	}


	public ModelAndView updateContact(Contact contact) {
		cRepo.updateContact(contact);
		return new ModelAndView("home.jsp");
	}


	public ModelAndView showAllContact() {
		List<Contact> list = cRepo.getAll();
		ModelAndView mav=new ModelAndView("show-all-contact.jsp");
		mav.addObject("contacts", list);
		return mav;
	}


	public ModelAndView addContactRequest(int uid) {
		ModelAndView view = new ModelAndView("add-contact.jsp");
		Contact cont=new Contact();
		User u=ur.getById(uid);
		System.out.println("im newly added...............");
		System.out.println(u.getUserName());
		cont.setUser(u);
	
		view.addObject("contact",cont);
		return view;
	}


	public ModelAndView addContact(Contact contact) {
		Contact contactByPhNo = cRepo.getContactByPhNo(contact.getContactPhno());
		if (contactByPhNo==null) {
			cRepo.saveContact(contact);
			return showAllContact();
		}
			
		return new ModelAndView("new-contact-error.jsp");
	}


	public ModelAndView updateDataRequest(int id, String fname, String lname, long cno) {
		c.setContactId(id);
		c.setContactFirstName(fname);
		c.setContactLastName(lname);
		c.setContactPhno(cno);
		
//		if (cRepo.getContactByPhNo(cno).getContactPhno()!=cno) {
//			cRepo.updateContact(c);
//			List<Contact> list = cRepo.getAll();
//			ModelAndView mav=new ModelAndView("show-all-contact.jsp");
//			mav.addObject("contacts", list);
//			return mav;
//		} 
		if (c.equals(cRepo.getContactByPhNo(cno))) {
			ModelAndView ma=new ModelAndView("new-contact-error.jsp");
			return ma;
		}
		else
		{
			cRepo.updateContact(c);
			List<Contact> list = cRepo.getAll();
			ModelAndView mav=new ModelAndView("show-all-contact.jsp");
			mav.addObject("contacts", list);
			return mav;
		}
		
		
	}


	public ModelAndView deleteContact(int id) {
		cRepo.deleteContactById(id);
		List<Contact> list = cRepo.getAll();
		ModelAndView mav=new ModelAndView("show-all-contact.jsp");
		mav.addObject("contacts", list);
		return mav;
	}
}


