package com.zhang.dto;

import com.zhang.entity.Employee;

import java.util.List;

public class DepartmentDTO {
    private Integer id;
    private String departmentName;
    private List<Employee> employees;

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
