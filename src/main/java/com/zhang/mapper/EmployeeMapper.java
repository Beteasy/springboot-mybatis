package com.zhang.mapper;

import com.zhang.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {
    //@Select("select * from employee where id =#{id}")
    Employee findEmployeeById(int id);
    //@Delete("delete from employee where id=#{id}")
    int deleteEmployeeById(int id);
    Integer createEmployee(Employee employee);
    Integer updateEmployee(Employee employee);
}
