package com.sharad.multipartfile.service;

import com.sharad.multipartfile.dto.UserDto;
import com.sharad.multipartfile.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String userRegister(UserDto dto, MultipartFile file) throws IOException {

        String uploadPath="E:/intune/";
        file.transferTo(new File(uploadPath+file.getOriginalFilename()));
        User  user=new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        user.setRole("User");
        user.setActive(true);
        user.setCreatedAt(LocalDateTime.now());

        UserDto userDto=new UserDto();
        userDto.setUsername(dto.getUsername());
        userDto.setEmail(dto.getEmail());
        return userDto+ " user saved successfully!";
    }
}
