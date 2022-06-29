package com.departments.controller;

import com.departments.entity.Department;
import com.departments.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService deptService;

    @PostMapping("/dept")
    public Department saveDept(@RequestBody Department dept)
    {
        return deptService.saveDept(dept);
    }


}
