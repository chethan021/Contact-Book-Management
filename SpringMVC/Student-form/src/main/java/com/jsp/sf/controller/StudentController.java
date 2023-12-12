package com.jsp.sf.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.jsp.sf.entity.Student;
import com.jsp.sf.service.StudentService;
@Controller
public class StudentController {
	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ModelAndView save(@RequestParam String roll_no,@RequestParam String student_Name,
			@RequestParam String location,
			@RequestParam String father_Name,
			@RequestParam String gender
			) {
		studentService.save(roll_no,student_Name,location,father_Name,gender);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("output.jsp");
		return mav;

	}
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ModelAndView getAll() {
		List<Student> list = studentService.getAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		mav.addObject("list", list);
		return mav;
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteById(@RequestParam int id) {
		studentService.deleteById(id);
		List<Student> list = studentService.getAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		mav.addObject("list", list);
		return mav;
	}

	//	public void getById(int student_Id) {
	//		studentRepo.getById(student_Id);
	//	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateById(@RequestParam int id) {
		Student student =studentService.getById(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("update.jsp");
		mav.addObject("student",student);
		return mav;
	}
	
	@RequestMapping(value = "/updating", method = RequestMethod.POST)
	public ModelAndView updating(@RequestParam int id,@RequestParam String roll_no,@RequestParam String student_Name,
			@RequestParam String location,
			@RequestParam String father_Name,
			@RequestParam String gender
			) {
		studentService.update(id,roll_no,student_Name,location,gender,father_Name);
		List<Student> list = studentService.getAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		mav.addObject("list", list);
		return mav;
	}
}
