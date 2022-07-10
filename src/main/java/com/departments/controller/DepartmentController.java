package com.departments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.departments.entity.Department;
import com.departments.service.DepartmentService;

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

	@DeleteMapping("/dept/{id}")
	public String delDept(@PathVariable("id") Long id) {
		deptService.delDept(id);
		return "Department deleted Sucessfully......";

	}

	@PutMapping("/dept/{id}")
	public Department updateDept(@PathVariable("id") Long id, @RequestBody Department dept) {
		return deptService.updateDept(id, dept);
	}

}
