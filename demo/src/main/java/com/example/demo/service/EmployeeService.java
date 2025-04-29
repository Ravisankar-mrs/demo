package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository empRepo;
	
	public List<EmployeeEntity> getEmployeeDetails() {
		return empRepo.findAll();
		
	}
	
	public EmployeeEntity getEmployeeById(int id) {
		return empRepo.getById(null);
	}
	
	
	public EmployeeEntity saveEmpDetais( EmployeeEntity emp) {
		empRepo.save(emp);
		EmployeeEntity empDetails = empRepo.getById(emp.getEmpId());
		return empDetails;
		
	}
	

}
