package com.jsp.myspringmvcfirstproject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SignUpController {
@RequestMapping("/signup")

public String register(HttpServletRequest req,HttpServletResponse resp) {
	String first = req.getParameter("Firstname");
	String last = req.getParameter("Lastame");
	String parameter = req.getParameter("Email");
	long contact_no = Long.parseLong(req.getParameter("Contact_No"));
	return "output.jsp";
}
}
