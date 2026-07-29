package com.jvr.booking.hotel.service;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.hotel.dto.HotelRequest;
import com.jvr.booking.hotel.model.Hotel;
import com.jvr.booking.hotel.repo.HotelRepository;

import jakarta.transaction.Transactional;


@Service
public class HotelService {
	
	 @Autowired	
	 private  HotelRepository hotelRepository;

	 //private final String UPLOAD_DIR = "uploads/";
     private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public Hotel saveHotelDetails(HotelRequest hotelRequest) throws IOException {

	        Hotel hotel = new Hotel();

	        hotel.setHotelName(hotelRequest.getHotelName());
	        hotel.setHotelOwnerName(hotelRequest.getHotelOwnerName ());
	        hotel.setMobile(hotelRequest.getMobile());
	        hotel.setEmail(hotelRequest.getEmail());
	        hotel.setAddress(hotelRequest.getAddress());
	        hotel.setPinCode(hotelRequest.getPinCode());
	        hotel.setDistrict(hotelRequest.getDistrict());
	        hotel.setState(hotelRequest.getState());
	        hotel.setFacilitiesProvided(hotelRequest.getFacilitiesProvided());
	        hotel.setFunctionType(hotelRequest.getFunctionType());
	        hotel.setManagerName(hotelRequest.getManagerName());
	        hotel.setManagerMobileNumber(hotelRequest.getManagerMobileNumber());
	        hotel.setApproximatePrice(hotelRequest.getApproximatePrice());
	        hotel.setCommissionAccepted(hotelRequest.getCommissionAccepted());

	        // Save files
	        hotel.setHotelPhoto(saveFile(hotelRequest.getHotelPhoto()));
	        

	        return hotelRepository.save(hotel);
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
	    
		public List<Hotel> getAllHotels() {
	        return hotelRepository.findAll();
		}

}