package com.jvr.booking.user.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponseDto {
	
	private int statusCode;
	private String message;
	private String token;
	private String role;
	private String expirationTime;
    private UserDTO user;

	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}
	public List<UserDTO> getUserList() {
		return userList;
	}
	public void setUserList(List<UserDTO> userList) {
		this.userList = userList;
	}
	private List<UserDTO> userList;

	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}	

}
