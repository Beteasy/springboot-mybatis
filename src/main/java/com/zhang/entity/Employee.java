package com.zhang.entity;

public class Employee {
    public Employee(int dId, String lastName, int gender, String email) {
        this.dId = dId;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public Employee(int id, int dId, String lastName, int gender, String email) {
        this.id = id;
        this.dId = dId;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public Employee() {
    }

    private int id;

    private int dId;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", dId=" + dId +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public int getdId() {
        return dId;
    }

    private String lastName;
    private int  gender;
    private String email;

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}
