package com.jparelation.relationproject.controller;

import com.jparelation.relationproject.dto.EmployeeReq;
import com.jparelation.relationproject.entity.Employee;
import com.jparelation.relationproject.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {
    private final EmployeeService _service;
    public EmployeeController(EmployeeService service) {
        this._service = service;
    }
    @PostMapping("createEmployee")
    public ResponseEntity<?> createEmployee(@RequestBody EmployeeReq emp){
        var res = _service.Create(emp);
        return ResponseEntity.ok(res);
    }
}
