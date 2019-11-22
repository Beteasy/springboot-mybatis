package com.zhang;

import com.zhang.entity.Employee;
import com.zhang.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@SpringBootTest
class SpringBootMybatisApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testMap(){
        Map<String, Object> byIdMap = employeeMapper.findByIdMap(1);
        System.out.println(byIdMap);
    }
    @Test
    void testMapList(){
        Map<Integer, Employee> allMapList = employeeMapper.findAllMapList();
        System.out.println(allMapList);

    }

    @Test
    void testBatchSave(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"lihua",1,"11@qq.com"));
        employees.add(new Employee(1,"lulu",1,"22@qq.com"));
        employees.add(new Employee(1,"hameimei",0,"33@qq.com"));
        employeeMapper.batchSave(employees);
    }

}
