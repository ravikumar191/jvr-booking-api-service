package com.jvr.booking.arkestra.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.arkestra.dto.ArkestraRequest;
import com.jvr.booking.arkestra.model.Arkestra;
import com.jvr.booking.arkestra.repo.ArkestraRepository;

import jakarta.transaction.Transactional;

@Service
public class ArkestraService {
	

	   @Autowired	
	   private  ArkestraRepository arkestraRepository;

	   //private final String UPLOAD_DIR = "uploads/";
       private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public Arkestra saveArkestraDetails(ArkestraRequest arkestraRequest) throws IOException {

	    	Arkestra arkestra = new Arkestra();

	    	arkestra.setGroupName(arkestraRequest.getGroupName());
	    	arkestra.setOwnerName(arkestraRequest.getOwnerName());
	    	arkestra.setMobile(arkestraRequest.getMobile());
	    	arkestra.setEmail(arkestraRequest.getEmail());
	    	arkestra.setAddress(arkestraRequest.getAddress());
	    	arkestra.setPinCode(arkestraRequest.getPinCode());
	    	arkestra.setDistrict(arkestraRequest.getDistrict());
	    	arkestra.setState(arkestraRequest.getState());
	    	arkestra.setExperience(arkestraRequest.getExperience());
	    	arkestra.setTotalMembers(arkestraRequest.getTotalMembers());
	        
	    	arkestra.setType(arkestraRequest.getType());
	    	arkestra.setPerformanceType(arkestraRequest.getPerformanceType());
	    	arkestra.setFunctionAvailable(arkestraRequest.getFunctionAvailable());
	    	arkestra.setBookingArea(arkestraRequest.getBookingArea());

	    	arkestra.setApproximatePrice(arkestraRequest.getApproximatePrice());
	    	arkestra.setCommissionAccepted(arkestraRequest.getCommissionAccepted());

	        // Save files
	    	arkestra.setDanceGroupLogo(saveFile(arkestraRequest.getDanceGroupLogo()));
	        

	        return arkestraRepository.save(arkestra);
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
	    
		public List<Arkestra> getAllArkestra() {
	        return arkestraRepository.findAll();
		}

}
