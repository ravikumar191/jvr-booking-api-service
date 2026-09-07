package com.jvr.booking.arkestra.controller;

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

import com.jvr.booking.arkestra.dto.ArkestraRequest;
import com.jvr.booking.arkestra.model.Arkestra;
import com.jvr.booking.arkestra.service.ArkestraService;

@RestController
@RequestMapping("/api/arkestra-details")
public class ArkestraController {
	
		@Autowired
		private ArkestraService arkestraService;

		@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<?> registerArkestra(@ModelAttribute ArkestraRequest request) {
			try {
				return ResponseEntity.ok(arkestraService.saveArkestraDetails(request));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}

		@GetMapping("/all-available-arkestra")
		public List<Arkestra> getAllArkestra() {
			return arkestraService.getAllArkestra();
		}
}

