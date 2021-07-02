package com.app.tacoLoco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView("home.html");
	}

}
