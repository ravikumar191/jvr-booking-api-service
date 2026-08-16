package com.jvr.booking.bandBaaja.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.bandBaaja.dto.BandBaajaRequest;
import com.jvr.booking.bandBaaja.model.BandBaaja;
import com.jvr.booking.bandBaaja.repo.BandBaajaRepository;
import jakarta.transaction.Transactional;


@Service
public class BandBaajService {
	

	   @Autowired	
	   private  BandBaajaRepository bandBaajaRepository;

	   //private final String UPLOAD_DIR = "uploads/";
       private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public BandBaaja saveBandBaajaDetails(BandBaajaRequest bandBaajaRequest) throws IOException {

	    	BandBaaja bandBaaja = new BandBaaja();

	    	bandBaaja.setBandName(bandBaajaRequest.getBandName());
	    	bandBaaja.setBandOwnerName(bandBaajaRequest.getBandOwnerName());
	    	bandBaaja.setMobile(bandBaajaRequest.getMobile());
	    	bandBaaja.setEmail(bandBaajaRequest.getEmail());
	    	bandBaaja.setAddress(bandBaajaRequest.getAddress());
	    	bandBaaja.setPinCode(bandBaajaRequest.getPinCode());
	    	bandBaaja.setDistrict(bandBaajaRequest.getDistrict());
	    	bandBaaja.setState(bandBaajaRequest.getState());
	    	bandBaaja.setExperience(bandBaajaRequest.getExperience());
	    	bandBaaja.setTotalMembers(bandBaajaRequest.getTotalMembers());
	    	bandBaaja.setBandType(bandBaajaRequest.getBandType());
	    	bandBaaja.setServices(bandBaajaRequest.getServices());
	    	bandBaaja.setAreaRange(bandBaajaRequest.getAreaRange());

	    	bandBaaja.setApproximatePrice(bandBaajaRequest.getApproximatePrice());
	    	bandBaaja.setCommissionAccepted(bandBaajaRequest.getCommissionAccepted());

	        // Save files
	    	bandBaaja.setBandPhoto(saveFile(bandBaajaRequest.getBandPhoto()));
	        

	        return bandBaajaRepository.save(bandBaaja);
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
	    
		public List<BandBaaja> getAllBandBaajas() {
	        return bandBaajaRepository.findAll();
		}

}
