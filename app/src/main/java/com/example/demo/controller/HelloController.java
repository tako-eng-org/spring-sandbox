package com.example.demo.controller;

import java.util.List;

import com.example.demo.jpa.users.User;
import com.example.demo.jpa.users.UserRepository;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@Autowired
	UserRepository userRepository;

  @RequestMapping("/")
	public String index(Model model, User user) {
		List<User> users = userRepository.findAll();
		model.addAttribute("users", users);

		return "hello";
	}
}
