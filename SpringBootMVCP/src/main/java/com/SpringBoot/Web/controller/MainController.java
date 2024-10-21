package com.SpringBoot.Web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String home() {
		return "index"; // Ensure that "index" is a valid HTML page
	}
	
	@RequestMapping("/contact")
	public String requestMethodName() {
		return "contact";
	}
	
}
