package com.nivetha.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		System.out.println("Inside the Setter method");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@PreDestroy
	public void bye() throws Exception {
		System.out.println("Inside the Destroy method");

	}

	@PostConstruct
	public void hi() throws Exception {
		System.out.println("Inside the Init method");

	}

}
