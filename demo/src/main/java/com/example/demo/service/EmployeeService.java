package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository empRepo;
	
	public List<EmployeeEntity> getEmployeeDetails() {
		return empRepo.findAll();
		
	}
	
	public EmployeeEntity getEmployeeById(int id) throws BadRequestException {
//		if(empRepo.existsById(id)) {
//			return empRepo.getById(id);
//		}else {
//			throw new BadRequestException("No data found");
//		}
		EmployeeEntity emp = new EmployeeEntity();
		try {
			if(empRepo.existsById(id)) {
				emp = empRepo.getById(id);
			}
			
		}catch (Exception e) {
			throw new BadRequestException("No data found");
		}
		
		return emp;

	}
	
	
	public EmployeeEntity saveEmpDetails( EmployeeEntity emp) {
		empRepo.save(emp);
		EmployeeEntity empDetails = empRepo.getById(emp.getEmpId());
		return empDetails;
		
	}
	
	public EmployeeEntity updateEmployee(EmployeeEntity emp) {
		EmployeeEntity exitEmp = empRepo.getById(emp.getEmpId());
		exitEmp.setEmpAge(emp.getEmpAge());
		exitEmp.setEmpDep(emp.getEmpDep());
		exitEmp.setEmpId(emp.getEmpId());
		exitEmp.setEmpName(emp.getEmpName());
		exitEmp.setEmpSalary(emp.getEmpSalary());
		empRepo.save(exitEmp);
		return exitEmp;  
	}
	
	public String deleteEmpDetails(int id) {
	if(empRepo.existsById(id)) {
		
		empRepo.deleteById(id);
		return"delete successfully";
	}else {
		return "No employee data found with this empId";
	}
	
	}

}
