package com.nivetha.spring.springcore.lifecycle.xmlconfiguration;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the Setter method");
		this.id = id;
	}

	public void hi() {
		System.out.println("Inside the Init method");
	}

	public void bye() {
		System.out.println("Inside the destroy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
