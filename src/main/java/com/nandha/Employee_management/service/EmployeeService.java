package com.nandha.Employee_management.service;

import com.nandha.Employee_management.model.Employee;
import com.nandha.Employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    //Spring creates an object (Bean) for this class
public class EmployeeService {

    @Autowired    //Spring automatically injects the repository here
    private EmployeeRepository repository;

    public Employee save (Employee emp){
        return repository.save(emp);
    }

    public List<Employee> getAll(){
        return repository.findAll();
    }

    public Employee getById(Long id){
        return repository.findById(id).orElse(null);
    }

    public void delete (Long id){
        repository.deleteById(id);
    }
}
