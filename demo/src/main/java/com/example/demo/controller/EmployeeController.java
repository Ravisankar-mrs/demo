package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	
	@Autowired
	public EmployeeService empService;
	
	@GetMapping("/Details")
	public List<EmployeeEntity> getAllEmployeesDetails(){
		return empService.getEmployeeDetails();
		
	}
	
	@GetMapping("/{id}")
	public EmployeeEntity getEmpById(@PathVariable int id) {
		return empService.getEmployeeById(id);
		
	}
	
	@PostMapping
	public EmployeeEntity saveEmployeeDetails(@RequestBody EmployeeEntity emp) {
		return empService.saveEmpDetais(emp);
		
	}

}
