package com.jparelation.relationproject.service;

import com.jparelation.relationproject.dto.EmployeeReq;
import com.jparelation.relationproject.entity.Employee;

public interface EmployeeService {
    Employee Create(EmployeeReq dto);
}
