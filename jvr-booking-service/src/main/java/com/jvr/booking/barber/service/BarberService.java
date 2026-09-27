package com.jvr.booking.barber.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.barber.dto.BarberRequest;
import com.jvr.booking.barber.model.Barber;
import com.jvr.booking.barber.repo.BarberRepository;

import jakarta.transaction.Transactional;

@Service
public class BarberService {
	

	   @Autowired	
	   private  BarberRepository barberRepository;

	   //private final String UPLOAD_DIR = "uploads/";
       private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public Barber saveBarberDetails(BarberRequest barberRequest) throws IOException {

	    	Barber barber = new Barber();

	    	barber.setBarberName(barberRequest.getBarberName());
	    	barber.setMobile(barberRequest.getMobile());
	    	barber.setEmail(barberRequest.getEmail());
	    	barber.setAddress(barberRequest.getAddress());
	    	barber.setPinCode(barberRequest.getPinCode());
	    	barber.setDistrict(barberRequest.getDistrict());
	    	barber.setState(barberRequest.getState());
	    	barber.setExperience(barberRequest.getExperience());
	    	barber.setAreaRangeCover(barberRequest.getAreaRangeCover());
	    	barber.setServicesOffered(barberRequest.getServicesOffered());
	    	barber.setOccasionsCovered(barberRequest.getOccasionsCovered());
	    	barber.setLanguagesKnown(barberRequest.getLanguagesKnown());

	    	barber.setApproximatePrice(barberRequest.getApproximatePrice());
	    	barber.setCommissionAccepted(barberRequest.getCommissionAccepted());

			// Save files
	    	barber.setBarberPhoto(saveFile(barberRequest.getBarberPhoto()));
	        

	        return barberRepository.save(barber);
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
	    
		public List<Barber> getAllBarbers() {
	        return barberRepository.findAll();
		}

}

