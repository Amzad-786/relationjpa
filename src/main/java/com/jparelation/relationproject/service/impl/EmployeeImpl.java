package com.jparelation.relationproject.service.impl;

import com.jparelation.relationproject.dto.EmployeeReq;
import com.jparelation.relationproject.entity.Employee;
import com.jparelation.relationproject.repository.EmployeeRepo;
import com.jparelation.relationproject.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeImpl implements EmployeeService {

    private final EmployeeRepo _repo;
    public EmployeeImpl(EmployeeRepo repo){
        this._repo = repo;
    }
    @Override
    public Employee Create(EmployeeReq dto){
        Employee emp = new Employee();
        emp.setName(dto.getName());
        emp.setEmail(dto.getEmail());
        emp.setSalary(dto.getSalary());
        emp.setDepartment(dto.getDepartment());
        return _repo.save(emp);
    }
}
