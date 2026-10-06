package com.jvr.booking.atishbaaziAndFirework.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.atishbaaziAndFirework.dto.AtishbaaziAndFireworkRequest;
import com.jvr.booking.atishbaaziAndFirework.model.AtishbaaziAndFirework;
import com.jvr.booking.atishbaaziAndFirework.repo.AtishbaaziAndFireworkRepository;

import jakarta.transaction.Transactional;


@Service
public class AtishbaaziAndFireworkService {
	

	   @Autowired	
	   private  AtishbaaziAndFireworkRepository atishbaaziAndFireworkRepository;

	   //private final String UPLOAD_DIR = "uploads/";
        private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public AtishbaaziAndFirework saveAtishbaaziAndFireworkDetails(AtishbaaziAndFireworkRequest atishbaaziAndFireworkRequest) throws IOException {

	    	AtishbaaziAndFirework atishbaaziAndFirework = new AtishbaaziAndFirework();
	    	
	    	atishbaaziAndFirework.setBusinessName(atishbaaziAndFireworkRequest.getBusinessName());
	    	atishbaaziAndFirework.setOwnerName(atishbaaziAndFireworkRequest.getOwnerName());
	    	atishbaaziAndFirework.setMobile(atishbaaziAndFireworkRequest.getMobile());
	    	atishbaaziAndFirework.setEmail(atishbaaziAndFireworkRequest.getEmail());
	    	atishbaaziAndFirework.setAddress(atishbaaziAndFireworkRequest.getAddress());
	    	atishbaaziAndFirework.setPinCode(atishbaaziAndFireworkRequest.getPinCode());
	    	atishbaaziAndFirework.setDistrict(atishbaaziAndFireworkRequest.getDistrict());
	    	atishbaaziAndFirework.setState(atishbaaziAndFireworkRequest.getState());
	    	atishbaaziAndFirework.setOccasionTypes(atishbaaziAndFireworkRequest.getOccasionTypes());
	    	atishbaaziAndFirework.setFireworksTypes(atishbaaziAndFireworkRequest.getFireworksTypes());
	    	atishbaaziAndFirework.setServices(atishbaaziAndFireworkRequest.getServices());
	    	atishbaaziAndFirework.setExperience(atishbaaziAndFireworkRequest.getExperience());
	    	atishbaaziAndFirework.setServiceArea(atishbaaziAndFireworkRequest.getServiceArea());
	    	atishbaaziAndFirework.setApproximatePrice(atishbaaziAndFireworkRequest.getApproximatePrice());
	    	atishbaaziAndFirework.setTermsAccepted(atishbaaziAndFireworkRequest.getTermsAccepted());

	        // Save files
	    	atishbaaziAndFirework.setFireworksPhoto(saveFile(atishbaaziAndFireworkRequest.getFireworksPhoto()));
	        

	        return atishbaaziAndFireworkRepository.save(atishbaaziAndFirework);
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
	    
		public List<AtishbaaziAndFirework> getAllAvailableAtishbaaziAndFirework() {
	        return atishbaaziAndFireworkRepository.findAll();
		}
		
}