package com.simonkuang.utilityfunctionservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String userName;
	@Column
	private String password;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the id
	 */
	public String getUserName() {
		return  userName;
	}
	/**
	 * @param id the id to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}/**
	 * @return the id
	 */
	public String getPassword() {
		return this.password;
	}
	/**
	 * @param id the id to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
