package com.zhang.controller;

import com.zhang.entity.Employee;
import com.zhang.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") int id) {
        return employeeMapper.findEmployeeById(id);
    }

    @PostMapping
    public Integer create(@RequestBody Employee employee) {
        employeeMapper.createEmployee(employee);
        System.out.println(employee);
        return employee.getId();
    }

    @PutMapping
    public Integer update(@RequestBody Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }
}
