package com.jvr.booking.hotel.controller;
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

import com.jvr.booking.hotel.dto.HotelRequest;
import com.jvr.booking.hotel.model.Hotel;
import com.jvr.booking.hotel.service.HotelService;

@RestController
@RequestMapping("/api/hotel-details")
public class HotelController {
	
		@Autowired
		private HotelService hotelService;

		/*
		 * @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE) public
		 * ResponseEntity<?> registerCar(@ModelAttribute VehicleRequest request) { try {
		 * return ResponseEntity.ok(vehicleService.saveVehicleDetails(request)); } catch
		 * (Exception e) { return ResponseEntity.badRequest().body(e.getMessage()); } }
		 */

		@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<?> registerHotel(@ModelAttribute HotelRequest request) {
			try {
				return ResponseEntity.ok(hotelService.saveHotelDetails(request));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}

		@GetMapping("/all-available-hotels")
		public List<Hotel> getAllHotels() {
			return hotelService.getAllHotels();
		}
	}
