package com.app.tacoLoco.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
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
		ModelAndView view = new ModelAndView("order_total");view.addObject("total", order.getTotal());
		return view;
	}
}
