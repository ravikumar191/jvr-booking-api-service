package com.jvr.booking.videoGraphy.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.videoGraphy.dto.PhotoVideographyRequest;
import com.jvr.booking.videoGraphy.model.PhotoVideoGraphy;
import com.jvr.booking.videoGraphy.repo.PhotoVideoGraphyRepository;

import jakarta.transaction.Transactional;

@Service
public class PhotoVideoGraphyService {
	

	   @Autowired	
	   private  PhotoVideoGraphyRepository photoVideoGraphyRepository;

	   //private final String UPLOAD_DIR = "uploads/";
        private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public PhotoVideoGraphy savePhotoVideoGraphyDetails(PhotoVideographyRequest photoVideographyRequest) throws IOException {

	    	PhotoVideoGraphy photoVideoGraphy = new PhotoVideoGraphy();

	    	photoVideoGraphy.setStudioName(photoVideographyRequest.getStudioName());
	    	photoVideoGraphy.setOwnerName(photoVideographyRequest.getOwnerName());
	    	photoVideoGraphy.setMobile(photoVideographyRequest.getMobile());
	    	photoVideoGraphy.setEmail(photoVideographyRequest.getEmail());
	    	photoVideoGraphy.setAddress(photoVideographyRequest.getAddress());
	    	photoVideoGraphy.setPinCode(photoVideographyRequest.getPinCode());
	    	photoVideoGraphy.setDistrict(photoVideographyRequest.getDistrict());
	    	photoVideoGraphy.setState(photoVideographyRequest.getState());
	    	photoVideoGraphy.setServices(photoVideographyRequest.getServices());
	    	photoVideoGraphy.setCategories(photoVideographyRequest.getCategories());
	    	photoVideoGraphy.setEquipment(photoVideographyRequest.getEquipment());
	    	photoVideoGraphy.setApproximatePrice(photoVideographyRequest.getApproximatePrice());
	    	photoVideoGraphy.setCommissionAccepted(photoVideographyRequest.getCommissionAccepted());

	        // Save files
	    	photoVideoGraphy.setStudioPhoto(saveFile(photoVideographyRequest.getStudioPhoto()));
	        

	        return photoVideoGraphyRepository.save(photoVideoGraphy);
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
	    
		public List<PhotoVideoGraphy> getAllPhotoVideoGraphy() {
	        return photoVideoGraphyRepository.findAll();
		}


}
