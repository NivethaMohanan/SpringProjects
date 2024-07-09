package com.nivetha.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/nivetha/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Name:"+hospital.getName());
		System.out.println("Departments"+hospital.getDepartments());
		System.out.println(hospital.getDepartments().getClass());
	}

}
