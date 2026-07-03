package com.jvr.booking.booking.car.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvr.booking.booking.car.dto.VehicleRequest;
import com.jvr.booking.booking.car.model.Vehicle;
import com.jvr.booking.booking.car.service.VehicleService;

@RestController
@RequestMapping("/api/car-details")
@CrossOrigin(origins = "http://localhost:3000")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	/*
	 * @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE) public
	 * ResponseEntity<?> registerCar(@ModelAttribute VehicleRequest request) { try {
	 * return ResponseEntity.ok(vehicleService.saveVehicleDetails(request)); } catch
	 * (Exception e) { return ResponseEntity.badRequest().body(e.getMessage()); } }
	 */

	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> registerCar(@ModelAttribute VehicleRequest request) {
		try {
			return ResponseEntity.ok(vehicleService.saveVehicleDetails(request));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping("/all-available-cars")
	public List<Vehicle> getAllCars() {
		return vehicleService.getAllCars();
	}
}
