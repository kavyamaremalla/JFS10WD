package com.spring.jpa.demo.mapper;

import com.spring.jpa.demo.dto.UserDto;
import com.spring.jpa.demo.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){ //convert your entity to your dto

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());

        return userDto;
    }

    public static User mapToUser(UserDto userDto){ //convert your dto to entity
        User user = new User();
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        return user;
    }

}
