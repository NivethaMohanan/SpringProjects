package com.nivetha.spring.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{

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

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside the Destroy method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside the afterPropertiesset method");
		
	}

}
