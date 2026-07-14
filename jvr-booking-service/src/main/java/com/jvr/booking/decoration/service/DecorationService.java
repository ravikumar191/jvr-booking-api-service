package com.jvr.booking.decoration.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.decoration.dto.DecorationRequest;
import com.jvr.booking.decoration.model.Decoration;
import com.jvr.booking.decoration.repo.DecorationRepository;

import jakarta.transaction.Transactional;

@Service
public class DecorationService {
	
	 @Autowired	
	 private  DecorationRepository decorationRepository;

	 //private final String UPLOAD_DIR = "uploads/";
     private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public Decoration saveDecorationDetails(DecorationRequest decorationRequest) throws IOException {

	    	Decoration decoration = new Decoration();

	    	decoration.setDecorationName(decorationRequest.getDecorationName());
	    	decoration.setDecorationOwnerName(decorationRequest.getDecorationOwnerName ());
	    	decoration.setMobile(decorationRequest.getMobile());
	    	decoration.setEmail(decorationRequest.getEmail());
	        decoration.setAddress(decorationRequest.getAddress());
	        decoration.setPinCode(decorationRequest.getPinCode());
	        decoration.setDistrict(decorationRequest.getDistrict());
	        decoration.setState(decorationRequest.getState());
	        decoration.setDecorationType(decorationRequest.getDecorationType());
	        decoration.setFacilityType(decorationRequest.getFacilityType());
	        decoration.setFunctionType(decorationRequest.getFunctionType());
	        decoration.setManagerName(decorationRequest.getManagerName());
	        decoration.setManagerMobileNumber(decorationRequest.getManagerMobileNumber());
	        decoration.setApproximatePrice(decorationRequest.getApproximatePrice());
	        decoration.setCommissionAccepted(decorationRequest.getCommissionAccepted());

	        // Save files
	        decoration.setDecorationPhoto(saveFile(decorationRequest.getDecorationPhoto()));
	        

	        return decorationRepository.save(decoration);
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


	   /* private String saveFile(MultipartFile file) throws IOException {
	        if (file == null || file.isEmpty()) return null;

	        try {
				Files.createDirectories(Paths.get(UPLOAD_DIR));
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        String filePath = UPLOAD_DIR + System.currentTimeMillis() + "_" + file.getOriginalFilename();
	        try {
				Files.copy(file.getInputStream(), Paths.get(filePath));
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return filePath;
	    }*/
	    
		public List<Decoration> getAllDecorations() {
	        return decorationRepository.findAll();
		}

}

