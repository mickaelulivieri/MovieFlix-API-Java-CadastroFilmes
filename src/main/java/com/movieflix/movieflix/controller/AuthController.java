package com.movieflix.movieflix.controller;

import com.movieflix.movieflix.config.TokenService;
import com.movieflix.movieflix.entity.User;
import com.movieflix.movieflix.mapper.UserMapper;
import com.movieflix.movieflix.request.LoginRequest;
import com.movieflix.movieflix.request.UserRequest;
import com.movieflix.movieflix.response.LoginResponse;
import com.movieflix.movieflix.response.UserResponse;
import com.movieflix.movieflix.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;


    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody UserRequest request){
        User savedUser = userService.save(UserMapper.toUser(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(UserMapper.toUserResponse(savedUser));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        UsernamePasswordAuthenticationToken userAndPass =
                new UsernamePasswordAuthenticationToken(request.email(), request.password());

        Authentication authenticate = authenticationManager.authenticate(userAndPass);

        User user = (User) authenticate.getPrincipal();

        String token = tokenService.generateToken(user);

        return ResponseEntity.ok(new LoginResponse(token));
        
    }

}
