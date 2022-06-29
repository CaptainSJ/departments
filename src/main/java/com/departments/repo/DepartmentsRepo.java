package com.departments.repo;

import com.departments.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepo extends JpaRepository<Department, Long> {


}
