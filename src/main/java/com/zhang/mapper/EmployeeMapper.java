package com.zhang.mapper;

import com.zhang.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMapper {
    List<Employee> findAll();
    //@Select("select * from employee where id =#{id}")
    Employee findEmployeeById(int id);
    //@Delete("delete from employee where id=#{id}")
    int deleteEmployeeById(int id);
    Integer createEmployee(Employee employee);
    Integer updateEmployee(Employee employee);

    Map<String,Object> findByIdMap(Integer id);
    @MapKey("id")
    Map<Integer,Employee> findAllMapList();

}
