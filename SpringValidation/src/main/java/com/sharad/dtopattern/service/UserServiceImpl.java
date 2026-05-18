package com.sharad.dtopattern.service;

import com.sharad.dtopattern.dto.UserDto;
import com.sharad.dtopattern.entity.User;
import com.sharad.dtopattern.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDto registerUser(UserDto userDto) {

        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setMobile(userDto.getMobile());

        User savedUser= userRepository.save(user);

        UserDto dto = new UserDto();
        dto.setName(savedUser.getName());
        dto.setEmail(savedUser.getEmail());
        dto.setMobile(savedUser.getMobile());

        return dto;
    }
}
