package com.example.department.service.impl;

import com.example.department.dto.DepartmentDto;
import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;
import com.example.department.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    private ModelMapper modelMapper;


    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        //convert dto to entity ::: to pass into repo
        Department department = modelMapper.map(departmentDto, Department.class);
        //convert from entity to dto ::: to pass into ctrlr
        return modelMapper.map( departmentRepository.save(department), DepartmentDto.class);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        return modelMapper.map(departmentRepository.findByDepartmentCode(departmentCode), DepartmentDto.class);
    }
}
