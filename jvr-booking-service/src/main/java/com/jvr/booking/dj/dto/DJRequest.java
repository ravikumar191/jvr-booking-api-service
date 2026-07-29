package com.jvr.booking.dj.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;

public class DJRequest {
	
    private String musicAndDJName;
    
    private String OwnerName;

    private String mobile;
    private String email;
    
    private String experience;
    
    @Column(length = 750)
    private String address;

    private String pinCode;
    private String district;
    private String state;

    private String serviceType; // comma separated

    private String equipment; // comma separated
    

   	    	    
    private String areaRangeCover;

    private Double approximatePrice;
    private Boolean commissionAccepted;

    // File paths
    private MultipartFile djPhoto;

	public String getMusicAndDJName() {
		return musicAndDJName;
	}

	public void setMusicAndDJName(String musicAndDJName) {
		this.musicAndDJName = musicAndDJName;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
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

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
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

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getAreaRangeCover() {
		return areaRangeCover;
	}

	public void setAreaRangeCover(String areaRangeCover) {
		this.areaRangeCover = areaRangeCover;
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

	public MultipartFile getDjPhoto() {
		return djPhoto;
	}

	public void setDjPhoto(MultipartFile djPhoto) {
		this.djPhoto = djPhoto;
	}

}
