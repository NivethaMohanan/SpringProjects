package com.nivetha.spring.springjdbc.employee.dao;

import java.util.List;

import com.nivetha.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {

	int Create(Employee employee);

	int Update(Employee employee);

	int Delete(int id);
	
	Employee read(int id);
	
	List<Employee> read();

}
