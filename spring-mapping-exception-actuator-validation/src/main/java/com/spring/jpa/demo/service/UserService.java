package com.spring.jpa.demo.service;

import com.spring.jpa.demo.dto.UserDto;
import com.spring.jpa.demo.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    List<UserDto> getAllUsers();

    UserDto getUserById(Long userId);

    UserDto updateUser(User user);

    void deleteUser(Long userId);

}
