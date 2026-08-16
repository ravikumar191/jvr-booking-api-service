package com.jvr.booking.bouncer.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.bouncer.dto.BouncerRequest;
import com.jvr.booking.bouncer.model.Bouncer;
import com.jvr.booking.bouncer.repo.BouncerRepository;

import jakarta.transaction.Transactional;

@Service
public class BouncerService {
	

	   @Autowired	
	   private  BouncerRepository bouncerRepository;

	   //private final String UPLOAD_DIR = "uploads/";
       private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public Bouncer saveBouncerDetails(BouncerRequest bouncerRequest) throws IOException {

	    	Bouncer bouncer = new Bouncer();

	    	bouncer.setAgencyName(bouncerRequest.getAgencyName());
	    	bouncer.setAgencyOwnerName(bouncerRequest.getAgencyOwnerName());
	    	bouncer.setMobile(bouncerRequest.getMobile());
	    	bouncer.setEmail(bouncerRequest.getEmail());
	    	bouncer.setAddress(bouncerRequest.getAddress());
	    	bouncer.setPinCode(bouncerRequest.getPinCode());
	    	bouncer.setDistrict(bouncerRequest.getDistrict());
	    	bouncer.setState(bouncerRequest.getState());
	    	bouncer.setExperience(bouncerRequest.getExperience());
	    	bouncer.setTotalMembers(bouncerRequest.getTotalMembers());
	    	bouncer.setBouncerAvailable(bouncerRequest.getBouncerAvailable());
	    	bouncer.setServices(bouncerRequest.getServices());
	    	bouncer.setBookingArea(bouncerRequest.getBookingArea());

	    	bouncer.setApproximatePrice(bouncerRequest.getApproximatePrice());
	    	bouncer.setCommissionAccepted(bouncerRequest.getCommissionAccepted());

	        // Save files
	    	bouncer.setBouncerAgencyPhoto(saveFile(bouncerRequest.getBouncerAgencyPhoto()));
	        

	        return bouncerRepository.save(bouncer);
	    }
	    
	    private String saveFile(MultipartFile file) throws IOException {
	        if (file == null || file.isEmpty()) return null;

	        Files.createDirectories(Paths.get(UPLOAD_DIR));

	        String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
	        String fullPath = UPLOAD_DIR + fileName;

	        Files.copy(file.getInputStream(), Paths.get(fullPath));

	        // 🔑 ONLY store public URL path in DB
	        return "/uploads/" + fileName;
	    }
	    
		public List<Bouncer> getAllBouncers() {
	        return bouncerRepository.findAll();
		}

}
