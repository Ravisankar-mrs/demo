package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.EmployeeEntity;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	
	 EmployeeEntity findByEmpId(int id);
;
}
