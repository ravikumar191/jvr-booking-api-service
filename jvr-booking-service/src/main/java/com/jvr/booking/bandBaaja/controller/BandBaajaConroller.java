package com.jvr.booking.bandBaaja.controller;

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

import com.jvr.booking.bandBaaja.dto.BandBaajaRequest;
import com.jvr.booking.bandBaaja.model.BandBaaja;
import com.jvr.booking.bandBaaja.service.BandBaajService;


@RestController
@RequestMapping("/api/bandBaaja-details")
public class BandBaajaConroller {
	
		@Autowired
		private BandBaajService bandBaajService;

		@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<?> registerBandBaaja(@ModelAttribute BandBaajaRequest request) {
			try {
				return ResponseEntity.ok(bandBaajService.saveBandBaajaDetails(request));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}

		@GetMapping("/all-available-bandBaaja")
		public List<BandBaaja> getAllBandBaaja() {
			return bandBaajService.getAllBandBaajas();
		}
}

