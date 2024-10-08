package com.spring.react.service.impl;

import com.spring.react.dto.EmployeeDto;
import com.spring.react.entity.Employee;
import com.spring.react.repository.EmployeeRepository;
import com.spring.react.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private ModelMapper modelMapper;

    // TODO handle exceptions for this class
    @Override
    public Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto) {

        Employee employee = modelMapper.map(employeeDto, Employee.class);

        Mono<Employee> employeeMono = employeeRepository.save(employee);

        return  employeeMono
                .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDto.class));
    }

    @Override
    public Mono<EmployeeDto> getEmployee(String employeeId) {
        return employeeRepository.findById(employeeId)
                .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDto.class));
    }

    @Override
    public Flux<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll()
                .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDto.class));
    }

    @Override
    //  TODO :: Write code for this method
    public Mono<EmployeeDto> updateEmployee(EmployeeDto employeeDto, String employeeId) {
        return null;
    }

    @Override
    public Mono<Void> deleteEmployee(String employeeId) {
        return employeeRepository.deleteById(employeeId);
    }
}

