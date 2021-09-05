package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import com.example.helloworld.domain.Message;

@Controller
public class HelloController {
	
	@GetMapping("/form")
	public String formAccess(Model model) {
		model.addAttribute("message", new Message());
		return "form";
	}
	
	@GetMapping("/result")
	public String resultAccess(Model model) {
		return "result";
	}
	
	@PostMapping("/next")
	public String greetingSubmit(@ModelAttribute Message msg, Model model) {
		return "form";
	}
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "name") String name, @RequestParam(value = "age") int age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
}