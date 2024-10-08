package com.spring.react.controller;

import com.spring.react.dto.EmployeeDto;
import com.spring.react.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.stream.Stream;

@RestController
@AllArgsConstructor
@RequestMapping("api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mono<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.saveEmployee(employeeDto);
    }

    @GetMapping("{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Mono<EmployeeDto> getEmployee(@PathVariable("id") String employeeId){
        return employeeService.getEmployee(employeeId);
    }

    //Server Side Events
    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public Flux<EmployeeDto> streamAllUsers() {

        return employeeService.getAllEmployees()
                .flatMap(employeeDto -> Flux.zip(
                    Flux.interval(Duration.ofSeconds(2)), Flux.fromStream(Stream.generate(() -> employeeDto))
                )).map(Tuple2::getT2);


//        return employeeService.getAllEmployees().delayElements(Duration.ofSeconds(2));
    }

}
