package com.jsp.ei.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {
	//@GetMapping("/test/{id}")
	@RequestMapping(value="/test/{id}",method=RequestMethod.GET)
	public void display(@PathVariable int id){
		System.out.println(id);
	}
}
