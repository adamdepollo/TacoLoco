package com.app.tacoLoco.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.tacoLoco.models.Order;

@RestController
public class AppController {
	
	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

	@PostMapping("/getTotal")
	@ResponseStatus(value=HttpStatus.OK)
	public ModelAndView sendOrder(@ModelAttribute("order") Order order) {
		ModelAndView view = new ModelAndView("order_total");
		view.addObject("order", order);
		return view;
	}
}
