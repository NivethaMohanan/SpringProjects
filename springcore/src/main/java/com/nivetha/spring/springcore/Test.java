package com.nivetha.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main (String[] args) {
	
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nivetha/spring/springcore/config.xml");
		Employee emp= (Employee) ctx.getBean("emp");
		System.out.println("Employee ID>: "+emp.getId());
		System.out.println("Employee Name>: "+emp.getName());
	}
}
