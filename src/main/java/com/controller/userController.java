package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.UserEntity;
import com.repositrory.UserRepository;

@Controller
public class userController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/signup")
	public String Signup() {
		return "signup";
	}
	
	@PostMapping("/saveuser")
	
	public String saveUser(UserEntity user) {
		userRepo.save(user);
		System.out.println(user.getUserId());
		return "signup";
	}
}
