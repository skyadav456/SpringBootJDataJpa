package com.sharad.multipartfile.service;

import com.sharad.multipartfile.dto.UserDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UserService {
    public String userRegister(UserDto dto, MultipartFile file) throws IOException;
}
