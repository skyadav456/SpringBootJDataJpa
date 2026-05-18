package com.sharad.dtopattern.service;

import com.sharad.dtopattern.dto.RequestDto;
import com.sharad.dtopattern.dto.ResponseDto;

public interface UserService {

    public ResponseDto registerUser(RequestDto requestDto);

}
