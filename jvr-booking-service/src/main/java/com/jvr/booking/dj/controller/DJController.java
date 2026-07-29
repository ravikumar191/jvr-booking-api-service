package com.jvr.booking.dj.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvr.booking.dj.dto.DJRequest;
import com.jvr.booking.dj.model.DJ;
import com.jvr.booking.dj.service.DJService;



@RestController
@RequestMapping("/api/dj-details")
public class DJController {
	
		@Autowired
		private DJService djService;

		/*
		 * @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE) public
		 * ResponseEntity<?> registerCar(@ModelAttribute VehicleRequest request) { try {
		 * return ResponseEntity.ok(vehicleService.saveVehicleDetails(request)); } catch
		 * (Exception e) { return ResponseEntity.badRequest().body(e.getMessage()); } }
		 */

		@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<?> registerDJ(@ModelAttribute DJRequest request) {
			try {
				return ResponseEntity.ok(djService.saveDJDetails(request));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}

		@GetMapping("/all-available-dj")
		public List<DJ> getAllCaterings() {
			return djService.getAllDJ();
		}
}


