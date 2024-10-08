package com.spring.react.service;

import com.spring.react.dto.EmployeeDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

        Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto);

        Mono<EmployeeDto> getEmployee(String employeeId);

        Flux<EmployeeDto> getAllEmployees();

        Mono<EmployeeDto> updateEmployee(EmployeeDto employeeDto, String employeeId);

        Mono<Void> deleteEmployee(String employeeId);
}
