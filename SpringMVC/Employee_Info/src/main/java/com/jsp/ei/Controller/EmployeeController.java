package com.jsp.ei.Controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.ei.entity.Employee;
import com.jsp.ei.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService empService;

	@PostMapping("/save")
	public ModelAndView save(@RequestParam int id, @RequestParam String ame, @RequestParam double empSal) {
		int i = empService.save(id, ame, empSal);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home.jsp");
		mav.addObject("empSal", empSal);

		return mav;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView DeleteById(@RequestParam int id) {
		empService.delete(id);
		List<Employee> list = empService.getAllDetails();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		mav.addObject("list", list);
		return mav;
	}

//	@RequestMapping(value = "/u", method = RequestMethod.GET)
//	public ModelAndView update(@RequestParam int id) {
//		List<Employee> list = empService.getAllDetails();
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("display.jsp");
//		mav.addObject("list", list);
//		return mav;
//	}

	@RequestMapping(value = "/get")
	public ModelAndView getAll() {
		List<Employee> list = empService.getAllDetails();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		mav.addObject("list", list);
		return mav;
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam int id) {
		Employee emp=  empService.getById(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("update.jsp");
		mav.addObject("list", emp);
		return mav;
	}
	
	@RequestMapping(value = "/updating", method = RequestMethod.POST)
	public ModelAndView updating(@RequestParam int id, @RequestParam String ame, @RequestParam double empSal) {
		empService.update(id, ame, empSal);
		System.out.println("from updating");
		List<Employee> list = empService.getAllDetails();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		mav.addObject("list", list);
		return mav;
	
	}
}
