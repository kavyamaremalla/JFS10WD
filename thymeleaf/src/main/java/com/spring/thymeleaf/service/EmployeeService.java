package com.spring.thymeleaf.service;

import com.spring.thymeleaf.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    void save(EmployeeDto employeeDto);

    EmployeeDto getEmpById(Long id);

    List<EmployeeDto> getAllEmployees();

    void deleteEmpById(Long id);
}
