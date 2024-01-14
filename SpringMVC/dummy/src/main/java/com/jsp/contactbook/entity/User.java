package com.jsp.contactbook.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.Check;
import org.springframework.stereotype.Component;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique;
@Component
@Entity
@Table(name="Users")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int userId;
	private String userName;
	@Column(name = "userEmail",unique = true)
	private String userEmail;
	private String password;
	@OneToMany(mappedBy = "user")
	private List<Contact> contacts=new ArrayList<>();
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	

}
