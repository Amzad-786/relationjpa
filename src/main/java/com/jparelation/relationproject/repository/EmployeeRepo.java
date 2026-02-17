package com.jparelation.relationproject.repository;

import com.jparelation.relationproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepo extends JpaRepository<Employee, UUID> {
}
