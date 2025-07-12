package com.nandha.Employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nandha.Employee_management.model.Employee;

// This interface lets you perform DB operations like save(),findAll() , etc..
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
