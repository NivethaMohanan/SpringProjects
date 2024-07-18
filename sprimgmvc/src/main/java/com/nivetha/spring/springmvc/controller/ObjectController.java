package com.nivetha.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nivetha.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Barath");
		emp.setSalary(100000);
		modelAndView.addObject("employee", emp);
		return modelAndView;
	}
}
