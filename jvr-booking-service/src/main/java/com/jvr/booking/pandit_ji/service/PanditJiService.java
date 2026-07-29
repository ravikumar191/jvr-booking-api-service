package com.jvr.booking.pandit_ji.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.pandit_ji.dto.PanditJiRequest;
import com.jvr.booking.pandit_ji.model.PanditJi;
import com.jvr.booking.pandit_ji.repo.PanditJiRepository;

import jakarta.transaction.Transactional;

@Service
public class PanditJiService {
	
	 @Autowired	
	 private  PanditJiRepository panditJiRepository;

	 //private final String UPLOAD_DIR = "uploads/";
     private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public PanditJi savePanditJIDetails(PanditJiRequest panditJiRequest) throws IOException {

	    	PanditJi panditJi = new PanditJi();

	    	panditJi.setPanditJiName(panditJiRequest.getPanditJiName());
	    	panditJi.setMobile(panditJiRequest.getMobile());
	    	panditJi.setEmail(panditJiRequest.getEmail());
	    	panditJi.setAddress(panditJiRequest.getAddress());
	    	panditJi.setPinCode(panditJiRequest.getPinCode());
	    	panditJi.setDistrict(panditJiRequest.getDistrict());
	        panditJi.setState(panditJiRequest.getState());
	        panditJi.setExperience(panditJiRequest.getExperience());
	        panditJi.setTypesOfPoojaPerform(panditJiRequest.getTypesOfPoojaPerform());
	        panditJi.setLanguagesKnown(panditJiRequest.getLanguagesKnown());
	        panditJi.setAreaRangeCover(panditJiRequest.getAreaRangeCover());
	        panditJi.setApproximatePrice(panditJiRequest.getApproximatePrice());
	        panditJi.setCommissionAccepted(panditJiRequest.getCommissionAccepted());

	        // Save files
	        panditJi.setPanditJiPhoto(saveFile(panditJiRequest.getPanditJiPhoto()));
	        

	        return panditJiRepository.save(panditJi);
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
	    
		public List<PanditJi> getAllPanditJi() {
	        return panditJiRepository.findAll();
		}

}
