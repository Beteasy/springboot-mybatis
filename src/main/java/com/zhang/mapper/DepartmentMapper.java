package com.zhang.mapper;

import com.zhang.dto.DepartmentDTO;
import com.zhang.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<Department> findAll();
    Integer createDepartment(Department department);
    Integer updateDepartment(Department department);
    void deleteDepartmentById(Integer id);
    DepartmentDTO findById(Integer id);
}
