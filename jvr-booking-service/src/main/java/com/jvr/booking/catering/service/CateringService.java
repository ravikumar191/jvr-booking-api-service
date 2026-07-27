package com.jvr.booking.catering.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.catering.dto.CateringRequest;
import com.jvr.booking.catering.model.Catering;
import com.jvr.booking.catering.repo.CateringRepository;

import jakarta.transaction.Transactional;

@Service
public class CateringService {
	
	   @Autowired	
	   private  CateringRepository cateringRepository;

	   //private final String UPLOAD_DIR = "uploads/";
       private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public Catering saveCateringDetails(CateringRequest cateringRequest) throws IOException {

	    	Catering catering = new Catering();

	    	catering.setCateringName(cateringRequest.getCateringName());
	    	catering.setCateringOwnerName(cateringRequest.getCateringOwnerName());
	    	catering.setMobile(cateringRequest.getMobile());
	    	catering.setEmail(cateringRequest.getEmail());
	    	catering.setAddress(cateringRequest.getAddress());
	    	catering.setPinCode(cateringRequest.getPinCode());
	    	catering.setDistrict(cateringRequest.getDistrict());
	        catering.setState(cateringRequest.getState());
	        catering.setFoodType(cateringRequest.getFoodType());
	        catering.setFacilityType(cateringRequest.getFacilityType());
	        catering.setFunctionType(cateringRequest.getFunctionType());
	        catering.setApproximatePrice(cateringRequest.getApproximatePrice());
	        catering.setCommissionAccepted(cateringRequest.getCommissionAccepted());

	        // Save files
	        catering.setCateringPhoto(saveFile(cateringRequest.getCateringPhoto()));
	        

	        return cateringRepository.save(catering);
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
	    
		public List<Catering> getAllCaterings() {
	        return cateringRepository.findAll();
		}

}
