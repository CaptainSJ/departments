package com.departments.controller;

import com.departments.entity.Department;
import com.departments.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService deptService;

	@PostMapping("/dept")
	public Department saveDept(@RequestBody Department dept) {
		return deptService.saveDept(dept);
	}

	@GetMapping("/dept")
	public List<Department> getDept() {

		return deptService.getDept();
	}

	@GetMapping("/dept/{id}")
	public Department getDept(@PathVariable("id") Long id) {

		Department deptById = deptService.getDept(id);

		return deptById;
	}

}
