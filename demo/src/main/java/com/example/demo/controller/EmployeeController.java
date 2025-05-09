package com.example.demo.controller;

import java.util.List;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/{empId}")
	public EmployeeEntity getEmpById(@PathVariable int empId) throws BadRequestException {
		 return empService.getEmployeeById(empId);
	}
	
	@PostMapping("/save_emp")
	public EmployeeEntity saveEmployeeDetails(@RequestBody EmployeeEntity emp) {
		return empService.saveEmpDetails(emp);
		
	}
	
	@PutMapping("/update_emp")
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity emp) {
		return empService.updateEmployee(emp);
	}
	
	@DeleteMapping("/delete/{empId}")
	public String deleteEmployeeById(@PathVariable int empId) {
		return empService.deleteEmpDetails(empId);
	}

}
