package com.jvr.booking.weddingRath.controller;

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

import com.jvr.booking.weddingRath.dto.WeddingRathRequest;
import com.jvr.booking.weddingRath.model.WeddingRath;
import com.jvr.booking.weddingRath.service.WeddingRathService;



@RestController
@RequestMapping("/api/weddingRath-details")
public class WeddingRathController {
	

	@Autowired
	private WeddingRathService weddingRathService;


	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> registerWeddingRath(@ModelAttribute WeddingRathRequest request) {
		try {
			return ResponseEntity.ok(weddingRathService.saveWeddingRathDetails(request));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping("/all-available-weddingRath")
	public List<WeddingRath> getAllCaterings() {
		return weddingRathService.getAllAvailableWeddingRath();
	}
}
