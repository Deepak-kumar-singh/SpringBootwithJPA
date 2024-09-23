package com.jang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jang.entity.Employee;
import com.jang.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	
	@Autowired
    private EmployeeRepository empRepository;

    @PostMapping("/emp")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData) {
        empRepository.saveAll(empData);
        return ResponseEntity.ok("Data saved");
    }

    
    
    
    
    @GetMapping("/emp")
    public List<Employee> getEmployees(){
        return empRepository.findAll();
    }

}
