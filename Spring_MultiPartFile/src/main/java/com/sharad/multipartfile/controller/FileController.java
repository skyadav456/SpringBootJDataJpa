package com.sharad.multipartfile.controller;

import com.sharad.multipartfile.dto.UserDto;
import com.sharad.multipartfile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class FileController {

    @Autowired
    private UserService service;
    @Autowired
    private UserService userService;


   /* @PostMapping("/upload")        // http://localhost:8080/files/upload
    public String uploadFile(@RequestParam("file")
                             MultipartFile file) {
        return file.getOriginalFilename();
    }*/

    // Use of RequestPart  -- file+json


    @PostMapping(
            value = "/register",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public String registerUser(@RequestPart("user") UserDto dto,
                               @RequestPart("file") MultipartFile file) throws Exception {

        return userService.userRegister(dto, file);

    }
}
