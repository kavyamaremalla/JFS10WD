package com.spring.boot.demo.controller;

import com.spring.boot.demo.bean.Student;
import com.spring.boot.demo.response.handler.ResponseHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
@Tag(name = "Basic CRUD Operations on a Student schema", description = "CRUD : Create, Read, Update, Delete Operations")
public class StudentController {

   static List<Student> studentList = new ArrayList<>();

   static {
       Student student1 = new Student(1,"John", true);
       Student student2 = new Student(2,"Peter", false);

       studentList.add(student1);// index : 0, 0th element
       studentList.add(student2);// index : 1, 1st element
   }

   @GetMapping("call-api")
    public String firstAPI(){
        return "Hello, Happy Coding! Please find next steps!";
    }

    @GetMapping("/getStudent")
    public ResponseEntity<Object> getStudentDetails(){
//       Student student = new Student(1,"John", true);
       return ResponseHandler.generateResponse("Successfully Retrieved Student Object", HttpStatus.OK, studentList.get(0));
    }

    @GetMapping("/getStudentList")
    public ResponseEntity<List<Student>> getStudentList(){
        return ResponseEntity.ok().body(studentList);
        //select * from student;
    }

    @GetMapping("/getStudent/{rollNum}")
    public ResponseEntity<Object> getStudentByRollNum(@PathVariable("rollNum") Integer rollNumber){

       Student student = studentList.get(rollNumber - 1);

       return ResponseHandler.generateResponse("Retrieved Student", HttpStatus.OK, student);
    }

    @GetMapping("/getStudentByQuery")
    public ResponseEntity<Object> getStudentByQueryParams(@RequestParam Integer rollNumber, @RequestParam String fullName){

        Student student = new Student(rollNumber, fullName, true);

        return ResponseHandler.generateResponse("Retrieved Student", HttpStatus.OK, student);
    }

    @PostMapping("addStudent")
    @Operation(summary = "This is creating student object into application", description = "Post Endpoint to add student details")
    @ApiResponse(
            responseCode = "201",
            description = "Student successfully created in your application : 201 Created"
    )
    public ResponseEntity<List<Student>> createStudent(@RequestBody Student student){

       student.setRollNumber(studentList.size() + 1); //auto-generating RollNumber

       studentList.add(student);

       return new ResponseEntity<>(studentList, HttpStatus.CREATED);
    }

    @PutMapping("update/{rollNum}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,
                                                 @PathVariable("rollNum") Integer rollNum){

       studentList.set(rollNum - 1, student);

       student.setRollNumber(rollNum);
       return ResponseEntity.ok(student);
    }

    @DeleteMapping("delete/{rollNum}")
    public ResponseEntity<String> deleteStudent(@PathVariable("rollNum") Integer rollNum){

       studentList.remove(rollNum - 1);

       return new ResponseEntity<>("Student successfully deleted", HttpStatus.NO_CONTENT);
    }
}
