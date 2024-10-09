package com.example.employee.controller;


import com.example.employee.dto.APIResponseDto;
import com.example.employee.dto.EmployeeDto;
import com.example.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<>
                (employeeService.saveEmployee(employeeDto), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable ("id") Long id){
        return new ResponseEntity<>(employeeService.getEmployee(id), HttpStatus.OK);
    }
}
