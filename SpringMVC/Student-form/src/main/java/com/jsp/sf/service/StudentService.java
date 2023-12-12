package com.jsp.sf.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.sf.entity.Student;
import com.jsp.sf.repository.StudentRepo;
@Service
public class StudentService {
	@Autowired
	Student student;
	@Autowired
	StudentRepo studentRepo;
	public void save(String roll_no,String student_Name, String location, String gender,String father_Name) {
		student.setStudent_Name(student_Name);
		student.setFather_Name(father_Name);
		student.setGender(gender);
		student.setRoll_no(roll_no);
		student.setLocation(location);
		studentRepo.save(student);
	}
	public void deleteById(int student_Id) {
		studentRepo.deleteById(student_Id);
	}
//	public void update(int student_Id) {
//		studentRepo.update(student_Id);
//	}
	public List<Student> getAll() {
		List<Student> all = studentRepo.getAll();
		return all;
	}
	public Student getById(int student_Id) {
		return studentRepo.getById(student_Id);
	}
	
	public void update(int id,String roll_no,String student_Name, String location,String gender,String father_Name) {
		student.setStudent_Name(student_Name);
		student.setStudent_Id(id);
		student.setFather_Name(father_Name);
		student.setGender(gender);
		student.setRoll_no(roll_no);
		student.setLocation(location);
		System.out.println("came for service update");
		studentRepo.update(student);
		System.out.println("Heelllllllllllllllllllll");
			}
	

}
