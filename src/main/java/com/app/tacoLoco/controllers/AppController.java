package com.app.tacoLoco.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.app.tacoLoco.models.Order;

@RestController
public class AppController {

	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView("home.html");
	}

	@PostMapping("/getTotal")
	@ResponseBody
	public String sendOrder(String veggieTacos, String chickenTacos, String beefTacos, String chorizoTacos) {
		return new Order(Integer.parseInt(veggieTacos), Integer.parseInt(chickenTacos), Integer.parseInt(beefTacos),
				Integer.parseInt(chorizoTacos)).getTotal();
	}
}
