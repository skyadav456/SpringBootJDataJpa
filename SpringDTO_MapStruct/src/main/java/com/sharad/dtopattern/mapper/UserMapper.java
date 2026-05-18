package com.sharad.dtopattern.mapper;

import com.sharad.dtopattern.dto.RequestDto;
import com.sharad.dtopattern.dto.ResponseDto;
import com.sharad.dtopattern.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntiry(RequestDto requestDto);   // dto to entity
    ResponseDto toDto(User user);      // entity to dto
}
