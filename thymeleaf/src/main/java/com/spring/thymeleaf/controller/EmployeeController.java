package com.spring.thymeleaf.controller;

import com.spring.thymeleaf.dto.EmployeeDto;
import com.spring.thymeleaf.entity.Employee;
import com.spring.thymeleaf.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController
@AllArgsConstructor
//@Slf4j
public class EmployeeController {

    private EmployeeService employeeService;

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/")
    public String viewHomePage(Model model){
        logger.trace("Trace level");
        logger.info("Info level");
        logger.debug("Debug level");
        logger.error("Error Level");
        logger.warn("Warning level");

        model.addAttribute("allemplist", employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewEmployee(Model model){
        //use DTO and map to entity
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
//        logger.info("Adding new employee" + model.getAttribute("employee"));
        return "newEmployee";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee")EmployeeDto employeeDto){
        employeeService.save(employeeDto);
        logger.info("Saving new employee " + employeeDto.getName());

        return "redirect:/";
    }


    @GetMapping("/showFormForUpdate/{id}")
    public String updateEmployee(@PathVariable(value = "id") Long id, Model model){
        EmployeeDto employee = employeeService.getEmpById(id);
        model.addAttribute("employee", employee);
        return "update";
    }

    @GetMapping("deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") Long id){
        employeeService.deleteEmpById(id);
        return "redirect:/";
    }
}
