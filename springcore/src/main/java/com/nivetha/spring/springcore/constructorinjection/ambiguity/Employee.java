package com.nivetha.spring.springcore.constructorinjection.ambiguity;

public class Employee {

	private int id;
	private Address address;

	Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}

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
