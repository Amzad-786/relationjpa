package com.jparelation.relationproject.service;

import com.jparelation.relationproject.dto.DepartmentReq;
import com.jparelation.relationproject.entity.Department;

public interface DepartmentService {
    Department createDepartment(DepartmentReq dto);

}
