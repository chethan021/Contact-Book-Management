package com.jsp.contactbook.repo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jsp.contactbook.entity.Contact;

@Repository
public class ContactRepo {
	@Autowired
	private EntityManagerFactory managerfactory;
	public void saveContact(Contact contact) {
		EntityManager manager = managerfactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(contact);
		transaction.commit();
		manager.close();

	}
	public Contact getById(int id) {
		EntityManager manager = managerfactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Contact contact = manager.find(Contact.class, id);
		transaction.commit();
		manager.close();
		return contact;
	}
	public List<Contact> getAll() {
		EntityManager manager = managerfactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		TypedQuery<Contact> query = manager.createQuery("From Contact",Contact.class);
		List<Contact> list = query.getResultList();
		transaction.commit();
		manager.close();
		return list;
	}
	public void updateContact(Contact contact) {
		EntityManager manager = managerfactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(contact);
		transaction.commit();
		manager.close();
	}
	public void deleteContactById(int id) {
		EntityManager manager = managerfactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Contact contact = manager.find(Contact.class, id);
		manager.remove(contact);
		transaction.commit();
		manager.close();
	}
	//	public Contact getContactByUserId(int userId,int conatctId) {
	//		EntityManager manager = managerfactory.createEntityManager();
	//		manager.createQuery("From Contact c where c.userId=userId",Contact.class);
	//		manager.close();
	//		return contact;
	//	}

}
