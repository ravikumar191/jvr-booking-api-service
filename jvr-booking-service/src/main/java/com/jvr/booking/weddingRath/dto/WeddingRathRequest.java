package com.jvr.booking.weddingRath.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;

public class WeddingRathRequest {

	private String rathName;
    
    private String rathOwnerName;

    private String mobile;
    private String email;
    
    @Column(length = 750)
    private String address;

    private String pinCode;
    private String district;
    private String state;

    private String rathType; // comma separated
    
    private String seatingCapacity;
    
    private String horseIncluded;
    
    private String decorationType; // comma separated
    
    private String services; // comma separated

    private String experience;
   	    	    
    private String areaRange;

    private Double approximatePrice;
    private Boolean termsAccepted;

    // File paths
    private MultipartFile rathPhoto;

	public String getRathName() {
		return rathName;
	}

	public void setRathName(String rathName) {
		this.rathName = rathName;
	}

	public String getRathOwnerName() {
		return rathOwnerName;
	}

	public void setRathOwnerName(String rathOwnerName) {
		this.rathOwnerName = rathOwnerName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRathType() {
		return rathType;
	}

	public void setRathType(String rathType) {
		this.rathType = rathType;
	}

	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getHorseIncluded() {
		return horseIncluded;
	}

	public void setHorseIncluded(String horseIncluded) {
		this.horseIncluded = horseIncluded;
	}

	public String getDecorationType() {
		return decorationType;
	}

	public void setDecorationType(String decorationType) {
		this.decorationType = decorationType;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAreaRange() {
		return areaRange;
	}

	public void setAreaRange(String areaRange) {
		this.areaRange = areaRange;
	}

	public Double getApproximatePrice() {
		return approximatePrice;
	}

	public void setApproximatePrice(Double approximatePrice) {
		this.approximatePrice = approximatePrice;
	}

	public Boolean getTermsAccepted() {
		return termsAccepted;
	}

	public void setTermsAccepted(Boolean termsAccepted) {
		this.termsAccepted = termsAccepted;
	}

	public MultipartFile getRathPhoto() {
		return rathPhoto;
	}

	public void setRathPhoto(MultipartFile rathPhoto) {
		this.rathPhoto = rathPhoto;
	}
	

}
