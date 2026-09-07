package com.jvr.booking.standUpComedian.controller;

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

import com.jvr.booking.standUpComedian.dto.StandUpComedianRequest;
import com.jvr.booking.standUpComedian.model.StandUpComedian;
import com.jvr.booking.standUpComedian.service.StandUpComedianService;


@RestController
@RequestMapping("/api/comedian-details")
public class StandUpComedianController {
	
		@Autowired
		private StandUpComedianService standUpComedianService;

		
		@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<?> registerComedian(@ModelAttribute StandUpComedianRequest request) {
			try {
				return ResponseEntity.ok(standUpComedianService.saveComedianDetails(request));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}

		@GetMapping("/all-available-comedians")
		public List<StandUpComedian> getAllAvailableComedians() {
			return standUpComedianService.getAllComedians();
		}
	}