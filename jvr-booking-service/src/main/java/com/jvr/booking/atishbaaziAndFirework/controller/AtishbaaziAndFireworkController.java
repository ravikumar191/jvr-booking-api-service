package com.jvr.booking.atishbaaziAndFirework.controller;

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

import com.jvr.booking.atishbaaziAndFirework.dto.AtishbaaziAndFireworkRequest;
import com.jvr.booking.atishbaaziAndFirework.model.AtishbaaziAndFirework;
import com.jvr.booking.atishbaaziAndFirework.service.AtishbaaziAndFireworkService;


@RestController
@RequestMapping("/api/atishbaaziAndFirework-details")
public class AtishbaaziAndFireworkController {
	

	@Autowired
	private AtishbaaziAndFireworkService atishbaaziAndFireworkService;


	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> registerAtishbaaziAndFireworkService(@ModelAttribute AtishbaaziAndFireworkRequest request) {
		try {
			return ResponseEntity.ok(atishbaaziAndFireworkService.saveAtishbaaziAndFireworkDetails(request));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping("/all-available-atishbaaziAndFirework")
	public List<AtishbaaziAndFirework> getAllAtishbaaziAndFireworks() {
		return atishbaaziAndFireworkService.getAllAvailableAtishbaaziAndFirework();
	}
}
