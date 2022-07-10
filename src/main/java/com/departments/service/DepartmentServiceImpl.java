package com.departments.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departments.entity.Department;
import com.departments.repo.DepartmentsRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentsRepo deptRepo;

	@Override
	public Department saveDept(Department dept) {
		return deptRepo.save(dept);
	}

	@Override
	public List<Department> getDept() {
		return deptRepo.findAll();
	}

	@Override
	public Department getDept(Long id) {
		return deptRepo.findById(id).get();

	}

	@Override
	public void delDept(Long id) {
		deptRepo.deleteById(id);

	}

	@Override
	public Department updateDept(Long id, Department dept) {

		Department deptDB = deptRepo.findById(id).get();

		if (Objects.nonNull(dept.getDeptName()) && dept.getDeptName() != "") {
			deptDB.setDeptName(dept.getDeptName());
		}

		if (Objects.nonNull(dept.getDeptCode()) && dept.getDeptCode() != "") {
			deptDB.setDeptCode(dept.getDeptCode());
		}

		if (Objects.nonNull(dept.getDeptLocation()) && dept.getDeptLocation() != "") {
			deptDB.setDeptLocation(dept.getDeptLocation());
		}

		return deptRepo.save(deptDB);
	}
}
