package com.example.department.controller;

import com.example.department.dto.DepartmentDto;
import com.example.department.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        return  new ResponseEntity<>(departmentService.saveDepartment(departmentDto), HttpStatus.CREATED);
    }

    @GetMapping("{department-code}") //from url
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable("department-code")  String deptCode){
        return new ResponseEntity<>(departmentService.getDepartmentByCode(deptCode), HttpStatus.OK);
    }
}
