package com.movieflix.movieflix.exception;

import org.aspectj.bridge.IMessage;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class UsernameOrPasswordInvalidException extends RuntimeException {

    public UsernameOrPasswordInvalidException(String message){
        super(message);

    }
}
