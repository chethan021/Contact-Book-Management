package com.jsp.contactbook.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Contacts")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contactId;
	private String contactFirstName;
	private String contactLastName;
	private long contactPhno;
	@ManyToOne
	private User user;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public long getContactPhno() {
		return contactPhno;
	}

	public void setContactPhno(long contactPhno) {
		this.contactPhno = contactPhno;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactFirstName, contactId, contactLastName, contactPhno, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Contact contact= (Contact)obj;
		return this.contactFirstName.equals(contact.contactFirstName)&& this.contactLastName.equals(contact.contactLastName)&& this.contactPhno
				==contact.contactPhno;
	}
	
	
}
