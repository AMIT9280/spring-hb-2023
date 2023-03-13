package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.AddressEntity;
import com.entity.EmployeeEntity;
import com.repositrory.AddressRepository;
import com.repositrory.EmployeeRepository;

@Controller
public class OneToOne {

	@Autowired
	 EmployeeRepository empRepo;
	
	@Autowired
	AddressRepository addRepo;

	@GetMapping("/loginemp")
	public String LoginEmp() {
		return "LoginEmp";
	}

	@PostMapping("/loginemp")
	public String LoginEmpAuthanticate(EmployeeEntity empEntity, HttpSession session) {
		empEntity = empRepo.findByEmployeeName(empEntity.getEmployeeName());
		if (empEntity == null) {
			return "LoginEmp";
		} else {
			session.setAttribute("emp", empEntity);
			return "Home";
		}
	}
	@PostMapping("/saveaddress")
	public String saveAddress(AddressEntity addEntity) {
		 addRepo.save(addEntity);
		return "Home";
	}
	@GetMapping("/addEmp")
	public String AddEmployee() {
		return "AddEmployee";
	}

	@PostMapping("/saveEmp")
	public String saveEmployee(EmployeeEntity employee) {
		empRepo.save(employee);
		return "AddEmployee";
	}
}
