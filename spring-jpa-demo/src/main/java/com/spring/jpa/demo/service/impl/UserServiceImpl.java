package com.spring.jpa.demo.service.impl;

import com.spring.jpa.demo.entity.User;
import com.spring.jpa.demo.repository.UserRepository;
import com.spring.jpa.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    //    @Autowired
    private UserRepository userRepository; //parameter

    @Override
    public User createUser(User user) {
        //Insert query will be called ====> save
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        //select * from table;
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        //findById(userId) -> select * from table where primaryKey/Id = userId;
        return userRepository.findById(userId).get();
    }

    @Override
    public User updateUser(User user) { //user is from postman/swagger => request from API, john S, jill p, johns@gmail.com

//        update table set(fName, lName, email) -> values

        User existingUser = userRepository.findById(user.getId()).get();//from db => john, jill, john@gmail.com

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());

        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long userId) {
        //delete * from table where id = userId
        userRepository.deleteById(userId);
    }
}
