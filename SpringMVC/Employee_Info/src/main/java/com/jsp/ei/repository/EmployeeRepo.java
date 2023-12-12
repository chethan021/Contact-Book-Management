package com.jsp.ei.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.jsp.ei.entity.Employee;
@Repository
public class EmployeeRepo {
	org.hibernate.cfg.Configuration con=new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(Employee.class);
	public void save(Employee emp) {
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(emp);
		transaction.commit();
		session.close();

	}
	public Employee getById(int id) {
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = session.get(Employee.class,id);
		transaction.commit();
		session.close();
		return employee;
	}
	public List<Employee> getAllDetails() {
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Query<Employee> query = session.createQuery("From Employee",Employee.class);
		List <Employee>list = query.list();
		return list;
	}
	public void delete(int id) {
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee emp = session.get(Employee.class,id);
		session.delete(emp);
		transaction.commit();
		session.close();

	}
	public void update(Employee emp) {
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(emp);
		transaction.commit();
		session.close();
		System.out.println("succe in dao");
	}
	
}
