package com.jvr.booking.standUpComedian.dto;

import org.springframework.web.multipart.MultipartFile;

public class StandUpComedianRequest {
	
    private String comedianName;

    private String bookingArea;

    private String mobile;
    private String email;
    
    private String comedyLanguage;
    
    private String comedyType;
    
    private String managerName;
    
    private String managerMobileNumber;


    private String functionType; // comma separated
    private Double approximatePrice;
    private Boolean commissionAccepted;

    // File paths
    private MultipartFile comedianPhoto;

	public String getComedianName() {
		return comedianName;
	}

	public void setComedianName(String comedianName) {
		this.comedianName = comedianName;
	}

	public String getBookingArea() {
		return bookingArea;
	}

	public void setBookingArea(String bookingArea) {
		this.bookingArea = bookingArea;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComedyLanguage() {
		return comedyLanguage;
	}

	public void setComedyLanguage(String comedyLanguage) {
		this.comedyLanguage = comedyLanguage;
	}

	public String getComedyType() {
		return comedyType;
	}

	public void setComedyType(String comedyType) {
		this.comedyType = comedyType;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerMobileNumber() {
		return managerMobileNumber;
	}

	public void setManagerMobileNumber(String managerMobileNumber) {
		this.managerMobileNumber = managerMobileNumber;
	}

	public String getFunctionType() {
		return functionType;
	}

	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	public Double getApproximatePrice() {
		return approximatePrice;
	}

	public void setApproximatePrice(Double approximatePrice) {
		this.approximatePrice = approximatePrice;
	}

	public Boolean getCommissionAccepted() {
		return commissionAccepted;
	}

	public void setCommissionAccepted(Boolean commissionAccepted) {
		this.commissionAccepted = commissionAccepted;
	}

	public MultipartFile getComedianPhoto() {
		return comedianPhoto;
	}

	public void setComedianPhoto(MultipartFile comedianPhoto) {
		this.comedianPhoto = comedianPhoto;
	}

}
