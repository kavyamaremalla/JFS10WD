package com.springboot.repository;

import com.springboot.model.Employee;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import static org.assertj.core.api.Assertions.*;

import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    private Employee employee;

    @BeforeAll
    public static void setUpAll(){
        System.out.println("Before all test cases");
    }

    @BeforeEach
    public void setUp(){

        employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setEmail("john@gmail.com");

        System.out.println("Inside before each");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After each test case");
    }

    @Test
//    @Ignore
    public void givenEmpObject_whenSave_thenReturnSavedEmp(){
        Employee savedEmp = employeeRepository.save(employee);

        assertThat(savedEmp).isNotNull();
        assertThat(savedEmp.getId()).isGreaterThan(0);
//        Assertions.assertEquals(employee, savedEmp);
    }

    @Test
    public void givenEmployeeList_whenFindAll_thenReturnEmployeeList(){

        Employee employee1  = new Employee();
        employee1.setFirstName("Peter");
        employee1.setLastName("Parker");
        employee1.setEmail("peterparker765@gmail.com");

        employeeRepository.save(employee);
        employeeRepository.save(employee1);

        List<Employee> employeeList = employeeRepository.findAll();

        //assert
        assertThat(employeeList).isNotNull();
        assertThat(employeeList.size()).isEqualTo(2);
    }

    @Test
    public void givenEmployeeObject_whenFindById_thenReturnEmployeeObject() {
        Employee savedEmployee = employeeRepository.save(employee);
        Employee employeeDb = employeeRepository.findById(savedEmployee.getId()).get();
        //checking -> assertion
        assertThat(employeeDb).isNotNull();
        Assertions.assertEquals(savedEmployee, employeeDb);

    }

    @Test
    public void givenEmployeeObject_whenUpdateEmployee_thenReturnUpdatedEmployeeObject() {
        Employee savedEmployee = employeeRepository.save(employee);
        Employee employeeDb = employeeRepository.findById(savedEmployee.getId()).get();
        employeeDb.setEmail("john_doe@gmail.com");
        Employee updatedEmployee = employeeRepository.save(employeeDb);
        //checking -> assertion
        assertThat(updatedEmployee.getEmail()).isEqualTo("john_doe@gmail.com");
    }

    @Test
    public void givenEmployeeObject_whenDeleteEmployee_thenRemoveEmployee() {
        Employee savedEmployee = employeeRepository.save(employee);
        employeeRepository.deleteById(savedEmployee.getId());

        Optional<Employee> employeeOptional = employeeRepository.findById(savedEmployee.getId());
        assertThat(employeeOptional).isEmpty();
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("After All");
    }
}
