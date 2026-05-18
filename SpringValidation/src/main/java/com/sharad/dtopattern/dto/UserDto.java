package com.sharad.dtopattern.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {

    @NotBlank(message = "Name is required")
    private String name;
    @Email(message = "Invalid Email")
    private String email;
    @Size(min=5, max=12, message = "Password must be 5-12")
    private String password;
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile no should be 10 digit")
    private String mobile;
}
