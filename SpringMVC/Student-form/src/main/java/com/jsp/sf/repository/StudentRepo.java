package com.jsp.sf.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.jsp.sf.entity.Student;
@Repository
public class StudentRepo {
	Configuration con =new Configuration().configure().addAnnotatedClass(Student.class);
	public void save(Student student) {
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(student);
		trans.commit();
		session.close();
	}
	public void deleteById(int student_Id) {
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Student student = session.get(Student.class, student_Id);
		session.delete(student);
		trans.commit();
		session.close();
	}
//	public void update(Student student) {
//		SessionFactory factory = con.buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction trans = session.beginTransaction();
//		session.update(student);
//		System.out.println("GCVHBJNKJVGYVUV");
//		System.out.println("fcvbnjhbjn");
//		trans.commit();
//		session.close();
//		System.out.println("srdtrytuhb");
//	}
	public List<Student> getAll() {
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query<Student> createQuery = session.createQuery("From Student",Student.class);
		List<Student> list = createQuery.list();
		transaction.commit();
		session.close();
		return list;
	}
	public Student getById(int student_Id) {
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Student student = session.get(Student.class, student_Id);
		transaction.commit();
		session.close(); 
		return student;
	}
public void update(Student student) {
	SessionFactory factory = con.buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	session.update(student);
	System.out.println("came for dao");
	transaction.commit();
	session.close();
}
//public void update(Student s)
//{
//	Configuration conf =new Configuration().configure().addAnnotatedClass(Student.class);
//	
//}
}
