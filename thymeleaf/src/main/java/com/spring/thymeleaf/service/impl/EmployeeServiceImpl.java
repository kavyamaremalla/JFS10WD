package com.spring.thymeleaf.service.impl;

import com.spring.thymeleaf.dto.EmployeeDto;
import com.spring.thymeleaf.entity.Employee;
import com.spring.thymeleaf.repository.EmployeeRepository;
import com.spring.thymeleaf.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private ModelMapper modelMapper;

    @Override
    public void save(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto, Employee.class);
         employeeRepository.save(employee);
    }

    @Override
    public EmployeeDto getEmpById(Long id) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee employee;

        if (optionalEmployee.isPresent()){
            employee = optionalEmployee.get();
        }else{
            throw new RuntimeException("Employee details with provided id " + id + " is not found");
        }

//        if (optionalEmployee.isEmpty()){
//            throw new RuntimeException("Employee details with provided id " + id + " is not found");
//        }
//
//        return modelMapper.map(optionalEmployee, EmployeeDto.class);

        return modelMapper.map(employee, EmployeeDto.class);

    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList.stream().map(employee -> modelMapper.map(employee, EmployeeDto.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteEmpById(Long id) {
//        Optional<Employee> optionalEmployee = employeeRepository.findById(id);

        if (employeeRepository.findById(id).isPresent()){
            employeeRepository.deleteById(id);
        }else{
            throw new RuntimeException("Employee details with provided id " + id + " is not found");
        }
    }

    //update API
}
