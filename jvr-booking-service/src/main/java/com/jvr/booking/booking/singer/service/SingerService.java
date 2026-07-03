package com.jvr.booking.booking.singer.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jvr.booking.booking.singer.dto.SingerRequest;
import com.jvr.booking.booking.singer.model.Singer;
import com.jvr.booking.booking.singer.repo.SingerRepository;

import jakarta.transaction.Transactional;

@Service
public class SingerService {
	
	 @Autowired	
	 private  SingerRepository singerRepository;

	 //private final String UPLOAD_DIR = "uploads/";
     private static final String UPLOAD_DIR = "D:/jvr-uploads/";



	    @Transactional
	    public Singer saveSingerDetails(SingerRequest singerRequest) throws IOException {

	        Singer singer = new Singer();

	        singer.setSingerName(singerRequest.getSingerName());
	        singer.setBookingArea(singerRequest.getBookingArea());
	        singer.setMobile(singerRequest.getMobile());
	        singer.setEmail(singerRequest.getEmail());
	        singer.setTypeOfSinger(singerRequest.getTypeOfSinger());
	        singer.setManagerName(singerRequest.getManagerName());
	        singer.setManagerMobileNumber(singerRequest.getManagerMobileNumber());
	        singer.setFunctionType(singerRequest.getFunctionType());
	        singer.setApproximatePrice(singerRequest.getApproximatePrice());
	        singer.setCommissionAccepted(singerRequest.getCommissionAccepted());

	        // Save files
	        singer.setSingerPhoto(saveFile(singerRequest.getSingerPhoto()));
	        

	        return singerRepository.save(singer);
	    }
	    
	    private String saveFile(MultipartFile file) throws IOException {
	        if (file == null || file.isEmpty()) return null;

	        Files.createDirectories(Paths.get(UPLOAD_DIR));

	        String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
	        String fullPath = UPLOAD_DIR + fileName;

	        Files.copy(file.getInputStream(), Paths.get(fullPath));

	        // 🔑 ONLY store public URL path in DB
	        return "/uploads/" + fileName;
	    }


	   /* private String saveFile(MultipartFile file) throws IOException {
	        if (file == null || file.isEmpty()) return null;

	        try {
				Files.createDirectories(Paths.get(UPLOAD_DIR));
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        String filePath = UPLOAD_DIR + System.currentTimeMillis() + "_" + file.getOriginalFilename();
	        try {
				Files.copy(file.getInputStream(), Paths.get(filePath));
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return filePath;
	    }*/
	    
		public List<Singer> getAllSingers() {
	        return singerRepository.findAll();
		}

}
