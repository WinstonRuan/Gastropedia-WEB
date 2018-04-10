package com.gastro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@Column(name = "USER_ID")
	@SequenceGenerator(name = "USER_GENERATE_SEQ", sequenceName = "USER_GENERATE_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_GENERATE_SEQ")
	private int userID;
	
	//The User's username
	@Column(name = "USERNAME", nullable = false, unique = true)
	private String userName;
	
	//The User's password
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	//User Role 1 is admin 2 is regular
	@Column(name = "ROLE")
	private int role;

	public User() {
		super();
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public User(String userName, String password, int role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}
	
}
