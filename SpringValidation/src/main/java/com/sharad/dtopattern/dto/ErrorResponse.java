package com.sharad.dtopattern.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
public class ErrorResponse {

    private LocalDateTime timestamp;
    private int status;
    private Map<String,String> errors;

    public ErrorResponse(
            LocalDateTime timestamp,
            int status,
            Map<String, String> errors) {

        this.timestamp = timestamp;
        this.status = status;
        this.errors = errors;
    }

}
