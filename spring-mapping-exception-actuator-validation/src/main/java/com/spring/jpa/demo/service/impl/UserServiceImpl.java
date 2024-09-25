package com.spring.jpa.demo.service.impl;

import com.spring.jpa.demo.dto.UserDto;
import com.spring.jpa.demo.entity.User;
import com.spring.jpa.demo.exception.EmailAlreadyExistsException;
import com.spring.jpa.demo.exception.ResourceNotFoundException;
import com.spring.jpa.demo.mapper.UserMapper;
import com.spring.jpa.demo.repository.UserRepository;
import com.spring.jpa.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    //    @Autowired
    private UserRepository userRepository; //parameter

//    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        //Insert query will be called ====> save

//        User user = UserMapper.mapToUser(userDto);

        User user = modelMapper.map(userDto, User.class); //mapToUser : userDto to User

        Optional<User> existingEmail = userRepository.findByEmail(user.getEmail());

        if (existingEmail.isPresent()){
            throw new EmailAlreadyExistsException("Email already exists, please give a new email  or login with old one");
        }
//        User savedUser = userRepository.save(user);
//        return UserMapper.mapToUserDto(savedUser);

        return modelMapper.map(userRepository.save(user), UserDto.class); //mapToUserDto : user to userDto
    }

    @Override
    public List<UserDto> getAllUsers() {
        //select * from table;
        List<User> userList = userRepository.findAll();
//        return userList.stream().map(UserMapper::mapToUserDto).collect(Collectors.toList());
        return userList.stream().map(user -> modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
    }

    @Override
    public UserDto getUserById(Long userId) {
        //findById(userId) -> select * from table where primaryKey/Id = userId;

//        return UserMapper.mapToUserDto(userRepository.findById(userId)
//                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId)));

        return modelMapper.map(userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId)) , UserDto.class);
    }

    @Override
    public UserDto updateUser(User user) { //user is from postman/swagger => request from API, john S, jill p, johns@gmail.com

//        update table set(fName, lName, email) -> values

        User existingUser = userRepository.findById(user.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", user.getId()));//from db => john, jill, john@gmail.com

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());

//        return UserMapper.mapToUserDto(userRepository.save(existingUser));

        return modelMapper.map(userRepository.save(existingUser), UserDto.class);
    }

    @Override
    public void deleteUser(Long userId) {
        //delete * from table where id = userId

        userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id",userId));

        userRepository.deleteById(userId);
    }
}
