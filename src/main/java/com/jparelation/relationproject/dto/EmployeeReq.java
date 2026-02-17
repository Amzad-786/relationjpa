package com.jparelation.relationproject.dto;

import com.jparelation.relationproject.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeReq {
    private String name;
    private String email;
    private BigDecimal salary;
    private Department department;
}
