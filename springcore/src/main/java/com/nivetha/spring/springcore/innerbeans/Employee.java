package com.nivetha.spring.springcore.innerbeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private int id;
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
