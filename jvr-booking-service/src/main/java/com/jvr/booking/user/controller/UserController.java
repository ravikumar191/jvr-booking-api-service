package com.jvr.booking.user.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import com.jvr.booking.user.dto.UserResponseDto;
import com.jvr.booking.user.service.IUserService;


@RestController
@RequestMapping("/users")
public class UserController {

   /*@Autowired
   private UserService userService;*/
    
    @Autowired
    private IUserService iUserService;

  /*  @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody User user) {
        String result = userService.registerUser(user);
        if (result.startsWith("Error")) {
            return ResponseEntity.badRequest().body(result);
        }
        return ResponseEntity.ok(result);
    }*
   
    @PostMapping("/login")
	public ResponseEntity<Response> login(@RequestBody User user) {
		Response response = new Response();
		ResponseEntity<Response> res = null;
		String userName = userService.getPhone(user);
		String password = userService.getPassword(user);
		if (userName.equals(user.getPhone()) && password.equals(user.getPassword())) {
			response.setStatus("Okay");
			response.setMessage("Success");
			res = new ResponseEntity<Response>(response, HttpStatus.OK);
		} else {
			response.setStatus("Fail");
			response.setMessage("Username and Password wrong");
			res = new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		return res;
	}*/
    
    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<UserResponseDto> getAllUsers() {
    	UserResponseDto userResponseDto = iUserService.getAllUsers();
        return ResponseEntity.status(userResponseDto.getStatusCode()).body(userResponseDto);
    }
    
    @GetMapping("/get-by-id/{userId}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable("userId") String userId) {
    	UserResponseDto response = iUserService.getUserById(userId);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
    
    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<UserResponseDto> deleteUser(@PathVariable("userId") String userId) {
    	UserResponseDto response = iUserService.deleteUser(userId);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
    
    @GetMapping("/get-logged-in-profile-info")
    public ResponseEntity<UserResponseDto> getLoggedInUserProfile() {
    	
    	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        UserResponseDto response = iUserService.getMyInfo(email);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
    
    @GetMapping("/get-user-bookings/{userId}")
    public ResponseEntity<UserResponseDto> getUserBookingHistory(@PathVariable("userId") String userId) {
    	UserResponseDto response = iUserService.getUserBookingHistory(userId);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
   
}
