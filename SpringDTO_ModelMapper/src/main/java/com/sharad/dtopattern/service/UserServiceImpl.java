package com.sharad.dtopattern.service;

import com.sharad.dtopattern.dto.RequestDto;
import com.sharad.dtopattern.dto.ResponseDto;
import com.sharad.dtopattern.entity.User;
import com.sharad.dtopattern.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper madelMapper;

    @Override
    public ResponseDto registerUser(RequestDto requestDto) {
        // request dto to entity
        User user = madelMapper.map(requestDto,User.class);
        // internal field
        user.setActive(true);
        user.setRole("USER");
        user.setCreatedAt(LocalDateTime.now());
        User savedUser= userRepository.save(user);

        // entity to responseDto
        ResponseDto responseDto=madelMapper.map(savedUser,ResponseDto.class);
        return responseDto;
    }
}
