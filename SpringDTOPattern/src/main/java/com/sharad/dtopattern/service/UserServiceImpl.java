package com.sharad.dtopattern.service;

import com.sharad.dtopattern.dto.RequestDto;
import com.sharad.dtopattern.dto.ResponseDto;
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
    public ResponseDto registerUser(RequestDto requestDto) {
        // dto to entity
        User user = new User();
        user.setUsername(requestDto.getUsername());
        user.setEmail(requestDto.getEmail());
        user.setPassword(requestDto.getPassword());

        // internal field
        user.setActive(true);
        user.setRole("USER");
        user.setCreatedAt(LocalDateTime.now());

        User savedUser= userRepository.save(user);

        // entity to responseDto
        ResponseDto responseDto = new ResponseDto();
        responseDto.setId(user.getId());
        responseDto.setUsername(savedUser.getUsername());
        responseDto.setEmail(savedUser.getEmail());
        responseDto.setMessage("User registered successfully");

        return responseDto;
    }
}
