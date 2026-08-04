package com.jvr.booking.videoGraphy.controller;

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

import com.jvr.booking.videoGraphy.dto.PhotoVideographyRequest;
import com.jvr.booking.videoGraphy.model.PhotoVideoGraphy;
import com.jvr.booking.videoGraphy.service.PhotoVideoGraphyService;

@RestController
@RequestMapping("/api/studio-details")
public class PhotoVideoGraphyController {
	

	@Autowired
	private PhotoVideoGraphyService photoVideoGraphyService;


	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> registerPhotoVideoGraphy(@ModelAttribute PhotoVideographyRequest request) {
		try {
			return ResponseEntity.ok(photoVideoGraphyService.savePhotoVideoGraphyDetails(request));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping("/all-available-Studio")
	public List<PhotoVideoGraphy> getAllCaterings() {
		return photoVideoGraphyService.getAllPhotoVideoGraphy();
	}
}




