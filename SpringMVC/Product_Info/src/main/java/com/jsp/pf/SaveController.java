package com.jsp.pf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SaveController {
	
	@Autowired
	ProductService productService;
	@RequestMapping("/save")
public String save(HttpServletRequest req, HttpServletResponse resp) {
	String name = req.getParameter("ProductName");
	String id=req.getParameter("ProductId");
	String price=req.getParameter("ProductPrice");
	productService.processProduct(id, name, price);
	return "output.jsp";
	
}
}
