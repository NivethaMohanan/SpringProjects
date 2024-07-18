package com.nivetha.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView Hello() {
		System.out.println("Testing");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name", "Nivetha");
		modelAndView.addObject("salary", 100000);
		return modelAndView;

	}
}
