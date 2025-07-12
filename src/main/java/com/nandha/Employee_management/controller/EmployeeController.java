package com.nandha.Employee_management.controller;

import com.nandha.Employee_management.model.Employee;
import com.nandha.Employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController    // Marks it as a Rest Controller
@RequestMapping("/employees")   //Base path
public class EmployeeController {

    @Autowired
    private EmployeeService service ;

    @PostMapping
    public Employee create (@RequestBody Employee employee){
        return service.save(employee);
    }

    @GetMapping
    public List<Employee> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById (@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "Deleted Successfully";
    }
}
