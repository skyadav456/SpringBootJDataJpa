package com.sharad.dtopattern.service;

import com.sharad.dtopattern.dto.RequestDto;
import com.sharad.dtopattern.dto.ResponseDto;
import com.sharad.dtopattern.entity.User;
import com.sharad.dtopattern.mapper.UserMapper;
import com.sharad.dtopattern.repository.UserRepository;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper mapper;

    @Override
    public ResponseDto registerUser(RequestDto requestDto) {
        // request dto to entity
        User user = mapper.toEntiry(requestDto);
        // internal field
        user.setActive(true);
        user.setRole("USER");
        user.setCreatedAt(LocalDateTime.now());
        User savedUser= userRepository.save(user);

        // entity to responseDto
        ResponseDto responseDto=mapper.toDto(savedUser);
        return responseDto;
    }
}
