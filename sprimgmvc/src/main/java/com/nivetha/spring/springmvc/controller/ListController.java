package com.nivetha.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nivetha.spring.springmvc.dto.Employee;

@Controller
public class ListController {
	
	@RequestMapping("/displayList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("Nivetha");
		emp1.setSalary(10000);
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("Mohanan");
		emp2.setSalary(20000);
		
		Employee emp3=new Employee();
		emp3.setId(3);
		emp3.setName("Barath");
		emp3.setSalary(30000);
		
		ArrayList<Employee> employee=new ArrayList <Employee>();
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		modelAndView.addObject("employees", employee);
		return modelAndView;
		
	}

}
