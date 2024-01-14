package com.jsp.contactbook.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.contactbook.entity.User;

@Repository
public class userRepo {
	@Autowired
	private EntityManagerFactory managerFactory;

	public void saveUser(User user) {
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(user);
		transaction.commit();
		manager.close();

	}
	public User getById(int id) {
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User user = manager.find(User.class, id);
		transaction.commit();
		manager.close();
		return user;
	}
	public List<User> getAll() {
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		TypedQuery<User> query = manager.createQuery("From User",User.class);
		List<User> list = query.getResultList();
		transaction.commit();
		manager.close();
		return list;
	}
	public void updateUserById(int id) {
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User user = manager.find(User.class, id);
		manager.merge(user);
		transaction.commit();
		manager.close();
	}
	public void deleteUserById(int id) {
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User user = manager.find(User.class, id);
		manager.remove(user);
		transaction.commit();
		manager.close();
	}
	public void updateUser(User user) {
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(user);
		transaction.commit();
		manager.close();

	}
	public void deleteUser(User user) {
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(user);
		transaction.commit();
		manager.close();

	}
//	public User loginByEmail(String email) {
//		EntityManager manager = managerFactory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		Query query = manager.createQuery("From User  where userEmail=:e");
//		query.setParameter("e", email);
//		User user =(User) query.getSingleResult();
//		transaction.commit();
//		manager.close();
//		return user;
//
//	}
	public User getUserByEmail(String userEmail) {
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createQuery("From User  where userEmail=:e");
		query.setParameter("e", userEmail);
		List<User> userli =query.getResultList();
		transaction.commit();
		User user;
		try {
			user=userli.get(0);
		} catch (Exception e) {
			return null;
		}
		manager.close();
		return user;

	}
	public void updatePass(String userEmail, String password) {

		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createQuery("From User  where userEmail=:e");
		query.setParameter("e", userEmail);
		List<User> userli =query.getResultList();
		System.out.println(userli);
		User user=userli.get(0);
		user.setPassword(password);
		manager.merge(user);
		transaction.commit();
		manager.close();
		
		
	
	}

}
