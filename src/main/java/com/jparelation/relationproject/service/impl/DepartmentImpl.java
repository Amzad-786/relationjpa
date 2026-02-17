package com.jparelation.relationproject.service.impl;

import com.jparelation.relationproject.dto.DepartmentReq;
import com.jparelation.relationproject.entity.Department;
import com.jparelation.relationproject.repository.DepartmentRepo;
import com.jparelation.relationproject.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentImpl implements DepartmentService {

    private final DepartmentRepo _repo;
    public DepartmentImpl(DepartmentRepo repo){
        this._repo = repo;
    }
    @Override
    public Department createDepartment(DepartmentReq dto){
        Department depart = new Department();
        depart.setName(dto.getName());
        return _repo.save(depart);
    }
}
