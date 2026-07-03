package com.jvr.booking.booking.singer.controller;

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

import com.jvr.booking.booking.singer.dto.SingerRequest;
import com.jvr.booking.booking.singer.model.Singer;
import com.jvr.booking.booking.singer.service.SingerService;

@RestController
@RequestMapping("/api/singer-details")
public class SingerController {
	
		@Autowired
		private SingerService singerService;

		/*
		 * @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE) public
		 * ResponseEntity<?> registerCar(@ModelAttribute VehicleRequest request) { try {
		 * return ResponseEntity.ok(vehicleService.saveVehicleDetails(request)); } catch
		 * (Exception e) { return ResponseEntity.badRequest().body(e.getMessage()); } }
		 */

		@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<?> registerSInger(@ModelAttribute SingerRequest request) {
			try {
				return ResponseEntity.ok(singerService.saveSingerDetails(request));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}

		@GetMapping("/all-available-singers")
		public List<Singer> getAllSingers() {
			return singerService.getAllSingers();
		}
	}

