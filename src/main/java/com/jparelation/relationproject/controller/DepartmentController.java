package com.jparelation.relationproject.controller;

import com.jparelation.relationproject.dto.DepartmentReq;
import com.jparelation.relationproject.entity.Department;
import com.jparelation.relationproject.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department/")
public class DepartmentController {
    private final DepartmentService _service;
    public DepartmentController(DepartmentService service){
        this._service = service;
    }
    @PostMapping("createDepartment")
    public ResponseEntity<?> createDepartment(@RequestBody DepartmentReq dto){
        var res = _service.createDepartment(dto);
        return ResponseEntity.ok(res);
    }
}
