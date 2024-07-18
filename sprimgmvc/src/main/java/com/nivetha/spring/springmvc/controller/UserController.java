package com.nivetha.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nivetha.spring.springmvc.dto.User;
//http://localhost:8080/sprimgmvc/showData?id=123&name=Nivetha&sal=70.68

@Controller
public class UserController {
	
	/*
	@RequestMapping("registrationPage")
	public ModelAndView showRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;

	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute() User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user",user);
		//modelAndView.setViewName("userReg");Displaying the same registration page
		modelAndView.setViewName("regResult");
		return modelAndView;

	}*/
	//Using ModelMap and String View
	@RequestMapping("registrationPage")
	public String showRegistrationPage() {
		return "userReg";

	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute() User user,ModelMap model) {
		System.out.println(user);
		model.addAttribute("user", user);
		return "regResult";

	}
}
