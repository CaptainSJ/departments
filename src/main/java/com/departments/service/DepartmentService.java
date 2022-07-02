package com.departments.service;

import com.departments.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Department saveDept(Department dept);

    List<Department> getDept();

    Department getDept(Long id);


}
