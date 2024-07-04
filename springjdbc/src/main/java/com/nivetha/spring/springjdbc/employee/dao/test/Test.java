package com.nivetha.spring.springjdbc.employee.dao.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nivetha.spring.springjdbc.employee.dao.EmployeeDao;
import com.nivetha.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nivetha/spring/springjdbc/employee/dao/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeedao");
		//Employee employee = new Employee();
		/*employee.setId(4);
		employee.setFirstName("Vicky");
		employee.setLastName("Mohanan");*/
		//int result = dao.Create(employee);
		//int result = dao.Update(employee);
		//int result=dao.Delete(3);
		//System.out.println("Number of records inserterd in Employee table:" + result);
		//System.out.println("Number of records updated in Employee table:" + result);
		//System.out.println("Number of records deleted in Employee table:" + result);
		//Employee employee=dao.read(2);
		List<Employee> employee=dao.read();
		System.out.println("Employee Record:"+employee);

	}

}
