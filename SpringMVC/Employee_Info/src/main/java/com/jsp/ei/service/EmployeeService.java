package com.jsp.ei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.ei.entity.Employee;
import com.jsp.ei.repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	Employee emp;
	@Autowired
	EmployeeRepo eRepo;

	public int save(int empId,String eName,double eSal) {

		emp.setEmp_ID(empId);
		emp.setEmp_Name(eName);
		emp.setEmp_Sal(eSal);
		eRepo.save(emp);
		return emp.getEmp_ID();
	}
	public List<Employee> getAllDetails(){
		return  eRepo.getAllDetails();
		
	}
	public Employee fetchById(int id) {
		Employee emp=eRepo.getById(id);
		return emp;
	}
	public void delete(int id) {
		eRepo.delete(id);

	}
	public void update(int id, String ame, double empSal) {
		emp.setEmp_ID(id);
		emp.setEmp_Name(ame);
		emp.setEmp_Sal(empSal);
		eRepo.update(emp);
	}
	public Employee getById(int id) {
		
		return eRepo.getById(id);
	}
	
}
