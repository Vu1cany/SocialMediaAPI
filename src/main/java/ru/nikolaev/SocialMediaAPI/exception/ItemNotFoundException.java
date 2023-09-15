package ru.nikolaev.SocialMediaAPI.exception;

import org.springframework.http.HttpStatus;

public class ItemNotFoundException extends BaseException{
    public ItemNotFoundException(String message, HttpStatus statusCode) {
        super(message, statusCode);
    }
}
