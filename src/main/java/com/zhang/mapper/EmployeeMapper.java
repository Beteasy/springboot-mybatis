package com.zhang.mapper;

import com.zhang.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> findAll();
    //@Select("select * from employee where id =#{id}")
    Employee findEmployeeById(int id);
    //@Delete("delete from employee where id=#{id}")
    int deleteEmployeeById(int id);
    Integer createEmployee(Employee employee);
    Integer updateEmployee(Employee employee);
}
