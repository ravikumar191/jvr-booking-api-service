package com.jvr.booking.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jvr.booking.common.OurException;
import com.jvr.booking.user.repo.UserRepository;


@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	
	@Autowired
    private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByEmail(username).orElseThrow(()-> new OurException("Username/email not found"));
	}

}
