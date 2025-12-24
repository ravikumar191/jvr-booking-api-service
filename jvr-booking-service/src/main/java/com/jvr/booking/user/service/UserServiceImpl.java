package com.jvr.booking.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jvr.booking.user.dto.LoginRequest;
import com.jvr.booking.user.dto.UserResponseDto;
import com.jvr.booking.user.dto.UserDTO;
import com.jvr.booking.common.OurException;
import com.jvr.booking.user.model.User;
import com.jvr.booking.user.repo.UserRepository;
import com.jvr.booking.user.utils.JWTUtils;
import com.jvr.booking.user.utils.Utils;


@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private JWTUtils jwtUtils;
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public UserResponseDto register(User user) {
		UserResponseDto userResponseDto = new UserResponseDto();
        try {
        	if(user.getRole() == null || user.getRole().isBlank()) {
        		user.setRole("USER");
        	}
        	if(userRepository.existsByEmail(user.getEmail()))
        	{
        		throw new OurException(user.getEmail() + "Already Exists");
        	}
        	user.setPassword(passwordEncoder.encode(user.getPassword()));
        	User savedUser = userRepository.save(user);
        	UserDTO userDTO = Utils.mapUserEntityToUserDTO(savedUser);
        	userResponseDto.setStatusCode(200);
        	userResponseDto.setUser(userDTO);

        	
        }catch(OurException e) {
        	userResponseDto.setStatusCode(400);
        	userResponseDto.setMessage(e.getMessage());
        }
        catch(Exception e) {
        	userResponseDto.setStatusCode(500);
        	userResponseDto.setMessage("Error Occurred during User Registration "+ e.getMessage());
        }
        
		return userResponseDto;
	}

	@Override
	public UserResponseDto login(LoginRequest loginRequest) { 
		UserResponseDto response = new UserResponseDto();
		
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
		    
			var user = userRepository.findByEmail(loginRequest.getEmail()).orElseThrow(()-> new OurException("User Not found"));
		    
			var token = jwtUtils.generateToken(user);
        	response.setStatusCode(200);        
        	response.setToken(token);
        	response.setExpirationTime("7 days");
        	response.setMessage("Succeessful");
			
		}catch(OurException e) {
        	response.setStatusCode(404);
        	response.setMessage(e.getMessage());
		}
        catch(Exception e) {
        	response.setStatusCode(500);
        	response.setMessage("Error Occurred during User Login "+ e.getMessage());
        }

		return response;
	}

	@Override
	public UserResponseDto getAllUsers() {
		
		UserResponseDto response = new UserResponseDto();
		try {
			List<User> userList = userRepository.findAll();
			List<UserDTO> userDTOList = Utils.mapUserListEntityToUserListDTO(userList);
        	response.setStatusCode(200);   
        	response.setMessage("Succeessful");
        	response.setUserList(userDTOList);

		}
        catch(Exception e) {
        	response.setStatusCode(500);
        	response.setMessage("Error getting all users "+ e.getMessage());
        }

		return response;
	}

	@Override
	public UserResponseDto getUserBookingHistory(String userId) {
		
		UserResponseDto response = new UserResponseDto();

		try {
			User user = userRepository.findById(Long.valueOf(userId)).orElseThrow(()->new OurException("User Not found"));
			UserDTO userDTO = Utils.mapUserEntityToUserDTOPlusUserBookings(user);
        	response.setStatusCode(200);   
        	response.setMessage("Succeessful");
        	response.setUser(userDTO);

		}catch(OurException e) {
        	response.setStatusCode(404);
        	response.setMessage(e.getMessage());
		}
		catch(Exception e) {
        	response.setStatusCode(500);
        	response.setMessage("Error getting all users "+ e.getMessage());
        }
		return response;
	}

	@Override
	public UserResponseDto deleteUser(String userId) {
		
		UserResponseDto response = new UserResponseDto();

		try {
			userRepository.findById(Long.valueOf(userId)).orElseThrow(()->new OurException("User Not found"));
			userRepository.deleteById(Long.valueOf(userId));
        	response.setStatusCode(200);   
        	response.setMessage("Succeessful");

		}catch(OurException e) {
        	response.setStatusCode(404);
        	response.setMessage(e.getMessage());
		}
		catch(Exception e) {
        	response.setStatusCode(500);
        	response.setMessage("Error getting all users "+ e.getMessage());
        }
		return response;
	}

	@Override
	public UserResponseDto getUserById(String userId) {
		
		UserResponseDto response = new UserResponseDto();

		try {
			User user = userRepository.findById(Long.valueOf(userId)).orElseThrow(()->new OurException("User Not found"));
			UserDTO userDTO = Utils.mapUserEntityToUserDTO(user);
        	response.setStatusCode(200);   
        	response.setMessage("Succeessful");
        	response.setUser(userDTO);

		}catch(OurException e) {
        	response.setStatusCode(404);
        	response.setMessage(e.getMessage());
		}
		catch(Exception e) {
        	response.setStatusCode(500);
        	response.setMessage("Error getting all users "+ e.getMessage());
        }
		return response;
	}

	@Override
	public UserResponseDto getMyInfo(String email) {
		
		UserResponseDto userResponseDto = new UserResponseDto();

		try {
			User user = userRepository.findByEmail(email).orElseThrow(()->new OurException("User Not found"));
			UserDTO userDTO = Utils.mapUserEntityToUserDTO(user);
			userResponseDto.setStatusCode(200);   
			userResponseDto.setMessage("Succeessful");
			userResponseDto.setUser(userDTO);

		}catch(OurException e) {
			userResponseDto.setStatusCode(404);
			userResponseDto.setMessage(e.getMessage());
		}
		catch(Exception e) {
			userResponseDto.setStatusCode(500);
			userResponseDto.setMessage("Error getting all users "+ e.getMessage());
        }
		return userResponseDto;
	}

}

