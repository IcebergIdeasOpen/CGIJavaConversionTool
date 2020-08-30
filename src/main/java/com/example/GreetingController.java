package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("greeting", new com.example.Greeting());
		return "greeting";
	}

	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute com.example.Greeting greeting, Model model) {
		model.addAttribute("greeting", greeting);
		TemperatureConverter converter = new TemperatureConverter();
		int celsius = converter.Input(greeting.getFahrenheit());
		greeting.setCelsius(celsius);
		return "result";
	}

}
