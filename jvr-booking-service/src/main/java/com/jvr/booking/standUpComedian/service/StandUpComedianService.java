package com.jvr.booking.standUpComedian.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.standUpComedian.dto.StandUpComedianRequest;
import com.jvr.booking.standUpComedian.model.StandUpComedian;
import com.jvr.booking.standUpComedian.repo.StandUpComedianRepository;

import jakarta.transaction.Transactional;

@Service
public class StandUpComedianService {
	
	 @Autowired	
	 private  StandUpComedianRepository standUpComedianRepository;

	 //private final String UPLOAD_DIR = "uploads/";
    private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public StandUpComedian saveComedianDetails(StandUpComedianRequest standUpComedianRequest) throws IOException {

	    	StandUpComedian standUpComedian = new StandUpComedian();

	    	standUpComedian.setComedianName(standUpComedianRequest.getComedianName());
	        standUpComedian.setBookingArea(standUpComedianRequest.getBookingArea());
	        standUpComedian.setMobile(standUpComedianRequest.getMobile());
	        standUpComedian.setEmail(standUpComedianRequest.getEmail());
	        standUpComedian.setComedyLanguage(standUpComedianRequest.getComedyLanguage());
	        standUpComedian.setComedyType(standUpComedianRequest.getComedyType());
	        standUpComedian.setManagerName(standUpComedianRequest.getManagerName());
	        standUpComedian.setManagerMobileNumber(standUpComedianRequest.getManagerMobileNumber());
	        standUpComedian.setFunctionType(standUpComedianRequest.getFunctionType());
	        standUpComedian.setApproximatePrice(standUpComedianRequest.getApproximatePrice());
	        standUpComedian.setCommissionAccepted(standUpComedianRequest.getCommissionAccepted());

	        // Save files
	        standUpComedian.setComedianPhoto(saveFile(standUpComedianRequest.getComedianPhoto()));
	        

	        return standUpComedianRepository.save(standUpComedian);
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

		public List<StandUpComedian> getAllComedians() {
	        return standUpComedianRepository.findAll();
		}

}

