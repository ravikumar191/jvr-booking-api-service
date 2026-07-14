package com.jvr.booking.decoration.controller;

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

import com.jvr.booking.decoration.dto.DecorationRequest;
import com.jvr.booking.decoration.model.Decoration;
import com.jvr.booking.decoration.service.DecorationService;

@RestController
@RequestMapping("/api/decoration-details")
public class DecorationController {
	
		@Autowired
		private DecorationService decorationService;

		/*
		 * @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE) public
		 * ResponseEntity<?> registerCar(@ModelAttribute VehicleRequest request) { try {
		 * return ResponseEntity.ok(vehicleService.saveVehicleDetails(request)); } catch
		 * (Exception e) { return ResponseEntity.badRequest().body(e.getMessage()); } }
		 */

		@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<?> registerDecoration(@ModelAttribute DecorationRequest request) {
			try {
				return ResponseEntity.ok(decorationService.saveDecorationDetails(request));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}

		@GetMapping("/all-available-decorations")
		public List<Decoration> getAllDecorations() {
			return decorationService.getAllDecorations();
		}
}


