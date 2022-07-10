package com.departments.service;

import java.util.List;

import com.departments.entity.Department;

public interface DepartmentService {

	Department saveDept(Department dept);

	List<Department> getDept();

	Department getDept(Long id);

	void delDept(Long id);

	Department updateDept(Long id, Department dept);

}
