package com.itgenius.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/forgotpassword")
	public String forgotpassword() {
		return "forgotpassword";
	}

	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}

	@GetMapping("/category")
	public String category() {
		return "category";
	}
}
