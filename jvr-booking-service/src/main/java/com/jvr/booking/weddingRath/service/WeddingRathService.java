package com.jvr.booking.weddingRath.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.weddingRath.dto.WeddingRathRequest;
import com.jvr.booking.weddingRath.model.WeddingRath;
import com.jvr.booking.weddingRath.repo.WeddingRathRepository;

import jakarta.transaction.Transactional;


@Service
public class WeddingRathService {
	

	   @Autowired	
	   private  WeddingRathRepository weddingRathRepository;

	   //private final String UPLOAD_DIR = "uploads/";
        private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public WeddingRath saveWeddingRathDetails(WeddingRathRequest weddingRathRequest) throws IOException {

	    	WeddingRath weddingRath = new WeddingRath();
	    	
	    	weddingRath.setRathName(weddingRathRequest.getRathName());
	    	weddingRath.setRathOwnerName(weddingRathRequest.getRathOwnerName());
	    	weddingRath.setMobile(weddingRathRequest.getMobile());
	    	weddingRath.setEmail(weddingRathRequest.getEmail());
	    	weddingRath.setAddress(weddingRathRequest.getAddress());
	    	weddingRath.setPinCode(weddingRathRequest.getPinCode());
	    	weddingRath.setDistrict(weddingRathRequest.getDistrict());
	    	weddingRath.setState(weddingRathRequest.getState());
	    	weddingRath.setRathType(weddingRathRequest.getRathType());
	    	weddingRath.setSeatingCapacity(weddingRathRequest.getSeatingCapacity());
	    	weddingRath.setHorseIncluded(weddingRathRequest.getHorseIncluded());
	    	weddingRath.setDecorationType(weddingRathRequest.getDecorationType());
	    	weddingRath.setServices(weddingRathRequest.getServices());
	    	weddingRath.setExperience(weddingRathRequest.getExperience());
	    	weddingRath.setAreaRange(weddingRathRequest.getAreaRange());
	    	weddingRath.setApproximatePrice(weddingRathRequest.getApproximatePrice());
	    	weddingRath.setTermsAccepted(weddingRathRequest.getTermsAccepted());

	        // Save files
	    	weddingRath.setRathPhoto(saveFile(weddingRathRequest.getRathPhoto()));
	        

	        return weddingRathRepository.save(weddingRath);
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
	    
		public List<WeddingRath> getAllAvailableWeddingRath() {
	        return weddingRathRepository.findAll();
		}
		
}