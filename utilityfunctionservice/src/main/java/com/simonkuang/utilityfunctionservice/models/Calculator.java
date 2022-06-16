package com.simonkuang.utilityfunctionservice.models;


import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Container(containerName = "Calculator")
public class Calculator {
	@Id
	@GeneratedValue
	private String id;
	@PartitionKey
	private String calc;
	private String answer;
	private String user;
	public Calculator () {
		
	}
	public Calculator( String calc, String answer, String user) {
		
		this.calc= calc;
		this.setAnswer(answer);
		this.setUser(user);
	}
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCalc() {
		return this.calc;
	}
	public void setCalc(String calc) {
		this.calc = calc;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
}
