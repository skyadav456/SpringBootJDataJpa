package com.sharad.dtopattern.controller;

import com.sharad.dtopattern.dto.RequestDto;
import com.sharad.dtopattern.dto.ResponseDto;
import com.sharad.dtopattern.service.UserService;
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
    public ResponseEntity<ResponseDto> userRegistration(@RequestBody RequestDto requestDto){
        return  new ResponseEntity<>(userService.registerUser(requestDto)
                            , HttpStatus.CREATED);
    }
}
