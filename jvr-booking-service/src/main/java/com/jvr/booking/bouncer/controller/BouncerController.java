package com.jvr.booking.bouncer.controller;

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

import com.jvr.booking.bouncer.dto.BouncerRequest;
import com.jvr.booking.bouncer.model.Bouncer;
import com.jvr.booking.bouncer.service.BouncerService;

@RestController
@RequestMapping("/api/bouncer-details")
public class BouncerController {
	
		@Autowired
		private BouncerService bouncerService;


		@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<?> registerBouncer(@ModelAttribute BouncerRequest request) {
			try {
				return ResponseEntity.ok(bouncerService.saveBouncerDetails(request));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}

		@GetMapping("/all-available-bouncer")
		public List<Bouncer> getAllBouncers() {
			return bouncerService.getAllBouncers();
		}
}
