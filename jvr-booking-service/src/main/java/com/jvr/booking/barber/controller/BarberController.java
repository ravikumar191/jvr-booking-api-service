package com.jvr.booking.barber.controller;

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

import com.jvr.booking.barber.dto.BarberRequest;
import com.jvr.booking.barber.model.Barber;
import com.jvr.booking.barber.service.BarberService;


@RestController
@RequestMapping("/api/barber-details")
public class BarberController {
	
		@Autowired
		private BarberService barberService;


		@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<?> registerBarber(@ModelAttribute BarberRequest request) {
			try {
				return ResponseEntity.ok(barberService.saveBarberDetails(request));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}

		@GetMapping("/all-available-barber")
		public List<Barber> getAllBouncers() {
			return barberService.getAllBarbers();
		}
}