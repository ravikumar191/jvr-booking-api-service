package com.jvr.booking.dj.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.dj.dto.DJRequest;
import com.jvr.booking.dj.model.DJ;
import com.jvr.booking.dj.repo.DJRepository;

import jakarta.transaction.Transactional;

@Service
public class DJService {
	
	   @Autowired	
	   private  DJRepository djRepository;

	   //private final String UPLOAD_DIR = "uploads/";
       private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public DJ saveDJDetails(DJRequest djRequest) throws IOException {

	    	DJ dj = new DJ();

	    	dj.setMusicAndDJName(djRequest.getMusicAndDJName());
	    	dj.setOwnerName(djRequest.getOwnerName());
	    	dj.setMobile(djRequest.getMobile());
	    	dj.setEmail(djRequest.getEmail());
	    	dj.setAddress(djRequest.getAddress());
	    	dj.setPinCode(djRequest.getPinCode());
	    	dj.setDistrict(djRequest.getDistrict());
	    	dj.setState(djRequest.getState());
	    	dj.setExperience(djRequest.getExperience());

	    	dj.setServiceType(djRequest.getServiceType());
	    	dj.setEquipment(djRequest.getEquipment());
	    	dj.setApproximatePrice(djRequest.getApproximatePrice());
	    	dj.setCommissionAccepted(djRequest.getCommissionAccepted());

	        // Save files
	        dj.setDjPhoto(saveFile(djRequest.getDjPhoto()));
	        

	        return djRepository.save(dj);
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
	    
		public List<DJ> getAllDJ() {
	        return djRepository.findAll();
		}

}
