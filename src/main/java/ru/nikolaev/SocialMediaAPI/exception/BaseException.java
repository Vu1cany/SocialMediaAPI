package ru.nikolaev.SocialMediaAPI.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public abstract class BaseException extends RuntimeException{
    private String message;
    private HttpStatus statusCode;
}
