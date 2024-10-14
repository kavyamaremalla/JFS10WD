package com.springboot.service;

import com.springboot.exception.ResourceNotFoundException;
import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // to initialize your mocks
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    // mock all the class calls inside your injected mocks class..

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    private Employee employee;

    @BeforeEach
    public void setUp(){
//        MockitoAnnotations.initMocks(this);

        employee = new Employee(1L, "John", "Doe", "john@gmail.com");

    }

    @Test
    public void testGivenEmployeeObj_whenSaveEmployee_thenReturnSavedEmployeeObject(){

//        Mockito.when(employeeRepository.findByEmail(anyString())).thenReturn(Optional.empty());

        given(employeeRepository.findByEmail(anyString())).willReturn(Optional.empty());
            //Mocking empRepository and expecting an empty response, which means emp with that email doesn't exist.

        given(employeeRepository.save(employee)).willReturn(employee);

        Employee savedEmployee = employeeService.saveEmployee(employee);

        assertThat(savedEmployee).isNotNull();

    }

    @Test
    public void testGivenEmployeeObjWithExistingEmail_whenSaveEmployee_thenThrowsException(){

        given(employeeRepository.findByEmail(anyString())).willReturn(Optional.of(employee));

//        Mockito.when(employeeRepository.findByEmail(employee.getEmail())).thenReturn(Optional.of(employee));

        Exception exception = Assertions.assertThrows(ResourceNotFoundException.class, () -> employeeService.saveEmployee(employee));

//        Mockito.doNothing().when(employeeRepository.save(any(Employee.class)));

        verify(employeeRepository, never()).save(any(Employee.class));

        String expectedMessage = "Employee already exist with given email:" + employee.getEmail();
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testGivenEmployeesList_whenGetAllEmployees_thenReturnEmployeesList() {
        Employee employee2 = new Employee();
        employee2.setFirstName("peter");
        employee2.setLastName("parker");
        employee2.setEmail("pete@gmail.com");
//        employee2.setLastName("doe");

        given(employeeRepository.findAll())
                .willReturn(List.of(employee, employee2));

        List<Employee> employeeList = employeeService.getAllEmployees();

        assertThat(employeeList).isNotNull();
        assertThat(employeeList.size()).isEqualTo(2);
    }

    @Test
    public void testGivenEmptyEmployeesList_whenGetAllEmployees_thenReturnEmptyEmployeesList() {
        given(employeeRepository.findAll())
                .willReturn(Collections.emptyList());

        List<Employee> employeeList = employeeService.getAllEmployees();

        assertThat(employeeList.size()).isEqualTo(0);
        assertThat(employeeList).isEmpty();
    }

    @Test
    public void givenEmployeeId_whenGetEmployeeById_thenReturnEmployeeObject() {
        given(employeeRepository.findById(anyLong())).willReturn(Optional.of(employee));
        Employee savedEmployee = employeeService.getEmployeeById(employee.getId()).get();
        assertThat(savedEmployee).isNotNull();
    }

    @Test
    public void givenEmployeeId_whenGetEmployeeById_thenReturnEmployeeNullObject() {
        given(employeeRepository.findById(anyLong())).willReturn(Optional.empty());
//        Employee savedEmployee = employeeService.getEmployeeById(employee.getId()).get();
        Optional<Employee> savedEmployee = employeeService.getEmployeeById(anyLong());
        Assertions.assertTrue(savedEmployee.isEmpty());
    }

    //update, other get endpoint scenarios

    @Test
    public void givenEmployeeId_whenDeleteEmployee_thenReturnNothing() {
        willDoNothing().given(employeeRepository).deleteById(employee.getId());

//     Mockito.doNothing().when(employeeRepository).deleteById(employee.getId());

        employeeService.deleteEmployee(employee.getId());
        verify(employeeRepository, times(1)).deleteById(employee.getId());
    }
}
