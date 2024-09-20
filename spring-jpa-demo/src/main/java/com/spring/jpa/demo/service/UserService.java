package com.spring.jpa.demo.service;

import com.spring.jpa.demo.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long userId);

    User updateUser(User user);

    void deleteUser(Long userId);

}
