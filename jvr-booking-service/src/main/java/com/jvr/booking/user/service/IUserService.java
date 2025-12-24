package com.jvr.booking.user.service;

import com.jvr.booking.user.dto.LoginRequest;
import com.jvr.booking.user.dto.UserResponseDto;
import com.jvr.booking.user.model.User;


public interface IUserService {
	
	UserResponseDto register(User user);
	
	UserResponseDto login(LoginRequest loginRequest);
	
	UserResponseDto getAllUsers();
	
	UserResponseDto getUserBookingHistory(String userId);
	
	UserResponseDto deleteUser(String userId);
	
	UserResponseDto getUserById(String userId);
	
	UserResponseDto getMyInfo(String userId);
}

