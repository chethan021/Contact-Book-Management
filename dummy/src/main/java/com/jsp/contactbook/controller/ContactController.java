package com.jsp.contactbook.controller;

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
}
