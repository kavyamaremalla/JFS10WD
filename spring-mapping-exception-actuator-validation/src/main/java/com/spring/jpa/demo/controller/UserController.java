package com.spring.jpa.demo.controller;

import com.spring.jpa.demo.dto.UserDto;
import com.spring.jpa.demo.entity.User;
import com.spring.jpa.demo.service.UserService;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

//    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    @Consumes(MediaType.APPLICATION_JSON) // Accepts only JSON requests
    @Produces(MediaType.APPLICATION_JSON) // Produces only JSON responses
    public ResponseEntity<?> createUser( @Valid @RequestBody UserDto userDto){
        //insert data into user

        try {
            UserDto savedUser = userService.createUser(userDto);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("User Creation failed " + e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }


    //task : try to add controller methods for remaining APIs//task : try to add controller methods for remaining APIs

    @GetMapping("/getAllUsers")
    public ResponseEntity<?> getAllUsers(){
        List<UserDto> userList = userService.getAllUsers();
        if (userList.isEmpty()) {
            return new ResponseEntity<>("No users Found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @GetMapping("/getUserById/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id) {
        UserDto userDto = userService.getUserById(id);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @PutMapping("/updateUserById/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long id, @RequestBody User User){
        User.setId(id);
        UserDto updateUser = userService.updateUser(User);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }


    @DeleteMapping("/deleteUserById/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>("User Deleted Successfully", HttpStatus.OK);
    }
}
