package com.example.demo.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public record ApiException (
        String message,
        Throwable trouble,
        HttpStatus httpStatus,
        ZonedDateTime zonedDateTime) {
}

// Record: private final field, getter for each field, public constructor, equalToHashCode, toString