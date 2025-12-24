package com.jvr.booking.user.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvr.booking.user.dto.LoginRequest;
import com.jvr.booking.user.dto.UserResponseDto;
import com.jvr.booking.user.model.User;
import com.jvr.booking.user.service.IUserService;


@RestController
@RequestMapping("/auth")
public class AuthController {
	
    @Autowired
    private IUserService iUserService;

	
	@PostMapping("/register")
    public ResponseEntity<UserResponseDto> register(@RequestBody User user) {
		UserResponseDto response = iUserService.register(user);
        return ResponseEntity.status(response.getStatusCode()).body(response);

    }
   
    @PostMapping("/login")
	public ResponseEntity<UserResponseDto> login(@RequestBody LoginRequest loginRequest) {
    	UserResponseDto response = iUserService.login(loginRequest);
        return ResponseEntity.status(response.getStatusCode()).body(response);
	}

}

