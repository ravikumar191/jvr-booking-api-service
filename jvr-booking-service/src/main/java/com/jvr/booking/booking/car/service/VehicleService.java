package com.jvr.booking.booking.car.service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.booking.car.dto.VehicleRequest;
import com.jvr.booking.booking.car.model.Vehicle;
import com.jvr.booking.booking.car.repo.VehicleRepository;

import jakarta.transaction.Transactional;

@Service
public class VehicleService {
	
        @Autowired	
	    private  VehicleRepository vehicleRepository;

	    //private final String UPLOAD_DIR = "uploads/";
        private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public Vehicle saveVehicleDetails(VehicleRequest request) throws IOException {

	        Vehicle vehicle = new Vehicle();

	        vehicle.setOwnerName(request.getOwnerName());
	        vehicle.setVehicleName(request.getVehicleName());
	        vehicle.setVehicleModel(request.getVehicleModel());
	        vehicle.setVehicleNumber(request.getVehicleNumber());
	        vehicle.setAddress(request.getAddress());
	        vehicle.setPinCode(request.getPinCode());
	        vehicle.setDistrict(request.getDistrict());
	        vehicle.setState(request.getState());
	        vehicle.setBookingArea(request.getBookingArea());
	        vehicle.setMobile(request.getMobile());
	        vehicle.setEmail(request.getEmail());
	        vehicle.setServices(request.getServices());
	        vehicle.setExpectedPrice(request.getExpectedPrice());
	        vehicle.setCommissionAccepted(request.getCommissionAccepted());

	        // Save files
	        vehicle.setVehiclePhoto(saveFile(request.getVehiclePhoto()));
	        vehicle.setRcDocument(saveFile(request.getRcDocument()));
	        vehicle.setDriverLicense(saveFile(request.getDriverLicense()));
	        

	        return vehicleRepository.save(vehicle);
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
	    
	    public List<Vehicle> getAllCars() {
	        return vehicleRepository.findAll();
	    }
}