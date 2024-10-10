package com.example.employee.service.impl;

import com.example.employee.dto.APIResponseDto;
import com.example.employee.dto.DepartmentDto;
import com.example.employee.dto.EmployeeDto;
import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private ModelMapper modelMapper;

    private ApiClient apiClient;

//    private RestTemplate restTemplate;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employeeEntity = modelMapper.map(employeeDto, Employee.class);
        return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDto.class);
    }

    @Override
    public APIResponseDto getEmployee(Long employeeId) {

        EmployeeDto employeeDto = modelMapper.map(employeeRepository.findById(employeeId), EmployeeDto.class);

        //API call to dept service based on emp's dept code and bring dept details here..

        /* Using Rest Template */
//        ResponseEntity<DepartmentDto> departmentDtoResponseEntity = restTemplate
//                .getForEntity("http://localhost:8080/api/departments/" + employeeDto.getDepartmentCode(), DepartmentDto.class);

//        DepartmentDto departmentDto = departmentDtoResponseEntity.getBody();

        /* Using Open Feign Client */

        DepartmentDto departmentDto = apiClient.getDepartment(employeeDto.getDepartmentCode());

//       APIResponseDto apiResponseDto = new APIResponseDto();
//       apiResponseDto.setEmployeeDto(employeeDto);
//       apiResponseDto.setDepartmentDto(departmentDto);

        return new APIResponseDto(employeeDto, departmentDto);
    }
}
