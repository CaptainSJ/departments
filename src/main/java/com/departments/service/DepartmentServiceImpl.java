package com.departments.service;

import com.departments.entity.Department;
import com.departments.repo.DepartmentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentsRepo deptRepo;


    @Override
    public Department saveDept(Department dept) {
        return deptRepo.save(dept);
    }
}
