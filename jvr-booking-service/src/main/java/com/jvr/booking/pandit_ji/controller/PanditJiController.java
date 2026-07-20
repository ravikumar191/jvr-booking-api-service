package com.jvr.booking.pandit_ji.controller;

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

import com.jvr.booking.pandit_ji.dto.PanditJiRequest;
import com.jvr.booking.pandit_ji.model.PanditJi;
import com.jvr.booking.pandit_ji.service.PanditJiService;

@RestController
@RequestMapping("/api/pandit-ji-details")
public class PanditJiController {
	
		@Autowired
		private PanditJiService panditJiService;

		/*
		 * @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE) public
		 * ResponseEntity<?> registerCar(@ModelAttribute VehicleRequest request) { try {
		 * return ResponseEntity.ok(vehicleService.saveVehicleDetails(request)); } catch
		 * (Exception e) { return ResponseEntity.badRequest().body(e.getMessage()); } }
		 */

		@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<?> registerPanditJi(@ModelAttribute PanditJiRequest request) {
			try {
				return ResponseEntity.ok(panditJiService.saveDecorationDetails(request));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}

		@GetMapping("/all-available-panditji")
		public List<PanditJi> getAllPanditJi() {
			return panditJiService.getAllPanditJi();
		}
}

