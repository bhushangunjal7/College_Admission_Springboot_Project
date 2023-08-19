package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudService;

@Controller
public class StudController {

	@Autowired
	private StudService service;
	
	
	
	
	@GetMapping("/")
	public String home() {
		return "welcome";
	}
	
	

	@GetMapping("/index")
	public String homes() {
		return "/index";
	}
	
	
	@GetMapping("/register_student")
	public String addStudForm(){
		return "register";
	}
	
	@PostMapping("/register")
	public String studRegister(@ModelAttribute Student s,HttpSession session) {
		
		System.out.println(s);
		session.setAttribute("msg", "Registration Successful....");
		service.addStud(s);
		
		return "redirect:/";
	}
	
}
