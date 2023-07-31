package com.example.demo.exception;

import lombok.Data;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@ToString
@Data
public class ApiException {
    private final String message;
    private final Throwable trouble;
    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;
}
