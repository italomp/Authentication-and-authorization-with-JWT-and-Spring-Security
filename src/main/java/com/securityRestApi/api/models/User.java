package com.securityRestApi.api.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User implements Serializable{
	/**
	 * added because of the Serializable
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_NAME", nullable = false, unique = true)
	private String username;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password; 
	
	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName; 
	
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName; 
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	public User() {
		
	}

	public User(String username, String password, String firstName, String lastName, String email) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	

}
