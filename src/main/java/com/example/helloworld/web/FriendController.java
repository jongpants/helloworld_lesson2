package com.example.helloworld.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.example.helloworld.domain.Friend;

@Controller
public class FriendController {
	ArrayList<Friend> friends = new ArrayList<Friend>();
	
	@GetMapping("/index")
	public String formAccess(Model model) {
		model.addAttribute("friend", new Friend());
		return "index";
	}
	
	@PostMapping("/lul")
	public String FullNameSubmit(@ModelAttribute Friend fnd, Model model) {
		return "index";
	}
}