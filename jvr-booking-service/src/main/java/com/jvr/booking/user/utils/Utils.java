package com.jvr.booking.user.utils;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;

import com.jvr.booking.user.dto.UserDTO;
import com.jvr.booking.user.model.User;

public class Utils {
	
	private static final String ALPHANUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01123456789";
	
	private static final SecureRandom secureRandom = new SecureRandom();
	
	public static String generateRandomAlphanumeric(int length) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0; i<length; i++) {
			int randomIndex = secureRandom.nextInt(ALPHANUMERIC_STRING.length());
			char randomChar = ALPHANUMERIC_STRING.charAt(randomIndex);
					stringBuilder.append(randomChar);
		}
		return stringBuilder.toString() ;
	}
	
	public static UserDTO mapUserEntityToUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setEmail(user.getEmail());
		userDTO.setPhone(user.getPhone());
		userDTO.setRole(user.getRole());
		
		return userDTO;
	}
	
	public static UserDTO mapUserEntityToUserDTOPlusUserBookings(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setEmail(user.getEmail());
		userDTO.setPhone(user.getPhone());
		userDTO.setRole(user.getRole());
		
		/*if(!user.getBookings().isEmpty()) {
			userDTO.setBookings(user.getBookings().stream().map(booking ->mapBookingEntityToBookingDTOPlusBookedService(booking,false)).collect(Collectors.toList());
		}*/
		
		return userDTO;
	}

	public static List<UserDTO> mapUserListEntityToUserListDTO(List<User> userList) {
		return userList.stream().map(Utils::mapUserEntityToUserDTO).collect(Collectors.toList());
	}
	
	
	/*public static BookingDTO mapBookingEntityToBookingDTOPlusBookedService(Booking booking, boolean mapUser) {
		
	}*/
}

