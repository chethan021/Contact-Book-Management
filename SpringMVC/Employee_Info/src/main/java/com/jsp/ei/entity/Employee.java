package com.jsp.ei.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Employee {
	@Id
	private int emp_ID;
	private String emp_Name;
	private double emp_Sal;
	public int getEmp_ID() {
		return emp_ID;
	}
	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public double getEmp_Sal() {
		return emp_Sal;
	}
	public void setEmp_Sal(double emp_Sal) {
		this.emp_Sal = emp_Sal;
	}
	
}
