package com.zhang.controller;

import com.zhang.entity.Department;
import com.zhang.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping
    public List<Department> list() {
        return departmentMapper.findAll();
    }

    @PostMapping
    public Integer create(@RequestBody Department department) {
        return departmentMapper.createDepartment(department);
    }

    @PutMapping
    public Integer update(@RequestBody Department department) {
        return departmentMapper.updateDepartment(department);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        departmentMapper.deleteDepartmentById(id);
    }


}
