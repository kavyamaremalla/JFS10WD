package com.spring.react.repository;

import com.spring.react.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository  extends ReactiveCrudRepository<Employee, String> {
}
