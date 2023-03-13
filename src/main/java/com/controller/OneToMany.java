package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.ProductEntity;
import com.entity.RoleEntity;
import com.entity.UserEntity;
import com.repositrory.UserRepository;
import com.repositrory.roleRepository;

@Controller
public class OneToMany {
	
		@Autowired
		roleRepository roleRepo;
		
		
		@Autowired
		UserRepository userRepo;
		
		@GetMapping("/addRole")
		public String addRole() {
			
			return "AddRole";
		}
		@PostMapping("/saverole")
		public String saveRole(RoleEntity roleEntity) {
			roleRepo.save(roleEntity);
			return "AddRole";
		}
		
		@GetMapping("AddUser")
		public String addUser(Model model) {
			List<RoleEntity> roles = roleRepo.findAll();
			model.addAttribute("roles", roles);
			return "AddUser";
		} 
		
		@PostMapping("/saveUser")
		public String saveuser(UserEntity userEntity) {
			userRepo.save(userEntity);
			return "redirect:/users";
		}
		@GetMapping("/users")  
		public String GetAllusers(Model model) {
			List<UserEntity> users = userRepo.findAll();
			model.addAttribute("users", users);
			return "ListUsers";
		}
		
		@GetMapping("/deleteUser/{userId}")  
		public String DeleteUser(@PathVariable("userId") Integer userId) {
			userRepo.deleteById(userId);
			return "redirect:/users";
		}

		@GetMapping("/UpdateUser/{userId}")
		public String UpdateUser(@PathVariable("userId")  Integer userId,Model model) {
			Optional<UserEntity> u = userRepo.findById(userId);
			UserEntity ue = null;
			if(u.isPresent()) {
				ue = u.get();
			} 
			System.out.println(ue.getRole());
			model.addAttribute("user",ue);
//			System.out.println(pe.getProductName());
			return "UpdateUser"; 
		}
		@PostMapping("/updateUser") 
		public String updateUser(UserEntity user) {
			 
			userRepo.save(user);  
			return "redirect:/users"; 
		} 
		
}
