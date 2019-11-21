package com.zhang.dto;

public class EmployeeDTO {
    private Integer id;
    private String lastName;
    private String departmentName;
    private int gender;
    private String email;

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}
