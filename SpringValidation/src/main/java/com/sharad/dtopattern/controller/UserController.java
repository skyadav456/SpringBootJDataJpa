package com.sharad.dtopattern.controller;

import com.sharad.dtopattern.dto.UserDto;
import com.sharad.dtopattern.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public ResponseEntity<UserDto> userRegistration(@Valid @RequestBody UserDto userDto){
        return  new ResponseEntity<>(userService.registerUser(userDto)
                            , HttpStatus.CREATED);
    }
}
