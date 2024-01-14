package com.jsp.contactbook.controller;

import javax.persistence.NamedStoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.jsp.contactbook.entity.Contact;
import com.jsp.contactbook.entity.User;
import com.jsp.contactbook.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	ContactService contactService;

	@RequestMapping(path="/add-contact",method =RequestMethod.GET)
	public ModelAndView saveContactRequest() {
		return contactService.saveContactRequest();
	}
	@RequestMapping(path = "/add-contact", method = RequestMethod.POST)
	public ModelAndView saveContact(Contact contact) {
		return contactService.saveContact(contact);
	}
	@RequestMapping(path="/update-contact", method=RequestMethod.GET)  
	public ModelAndView updateUserRequest(@RequestParam int contactId) {
		return contactService.updateContactRequest(contactId);
	}
	@RequestMapping(path="/update-contact", method = RequestMethod.POST)
	public ModelAndView updateUser(Contact contact) {
		return contactService.updateContact(contact);
	}
	@RequestMapping(path = "/show-all-contact",method = RequestMethod.GET )
	public ModelAndView showallcontact() {
		return contactService.showAllContact();
	}
	@RequestMapping(path = "/AddContact",method=RequestMethod.GET)
	public ModelAndView AddcontactRequest(@RequestParam int  uid) {
		return contactService.addContactRequest(uid);
	}
	@RequestMapping(path = "/AddContact",method=RequestMethod.POST)
	public ModelAndView Addcontact(Contact contact) {
		return contactService.addContact(contact);
	}
	@RequestMapping(path = "/updateContactRequest")
	public ModelAndView updateContactRequest(@RequestParam int id) {
		return contactService.updateContactRequest(id);
	}
	@RequestMapping(path = "/updateDataRequest",method = RequestMethod.POST)
	public ModelAndView updateDataRequest(@RequestParam int id,@RequestParam String fname,@RequestParam String lname,@RequestParam long cno) {
		return contactService.updateDataRequest(id,fname,lname,cno);
	}
	@RequestMapping(path = "deleteContact", method=RequestMethod.GET)
	public ModelAndView deleteContact(@RequestParam int id) {
		return contactService.deleteContact(id);
	}
	
	
	

}
