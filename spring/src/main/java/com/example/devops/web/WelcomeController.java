package com.example.devops.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String welcom(Model model) {
		model.addAttribute("course","DevOps");
		return "index";
}
}