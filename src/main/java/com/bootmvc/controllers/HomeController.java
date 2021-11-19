package com.bootmvc.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bootmvc.beans.Employee;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/emp_register")
	public String showForm(@ModelAttribute("emp") Employee emp) {
		return "register";
	}

	@PostMapping("/emp_register")
	public String regiserEmployee(Map<String, Object> map, @ModelAttribute("emp1") Employee emp) {
		// read and use form data from model class object or send to service class
		System.out.println(emp);
		return "result";
	}

}
