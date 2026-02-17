package com.jparelation.relationproject.repository;

import com.jparelation.relationproject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DepartmentRepo extends JpaRepository<Department,UUID> {
}
