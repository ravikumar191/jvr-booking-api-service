package com.jvr.booking.bandBaaja.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;

public class BandBaajaRequest {
	
    
    private String bandName;
    
    private String bandOwnerName;

    private String mobile;
    private String email;
    
    @Column(length = 750)
    private String address;

    private String pinCode;
    private String district;
    private String state;

    private String experience; 
    
    private String totalMembers; 
 	    
    private String bandType; // comma separated
    
    private String services; // comma separated

   	    	    
    private String areaRange;

    private Double approximatePrice;
    private Boolean commissionAccepted;

    // File paths
    private MultipartFile bandPhoto;

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public String getBandOwnerName() {
		return bandOwnerName;
	}

	public void setBandOwnerName(String bandOwnerName) {
		this.bandOwnerName = bandOwnerName;
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

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getTotalMembers() {
		return totalMembers;
	}

	public void setTotalMembers(String totalMembers) {
		this.totalMembers = totalMembers;
	}

	public String getBandType() {
		return bandType;
	}

	public void setBandType(String bandType) {
		this.bandType = bandType;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
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

	public Boolean getCommissionAccepted() {
		return commissionAccepted;
	}

	public void setCommissionAccepted(Boolean commissionAccepted) {
		this.commissionAccepted = commissionAccepted;
	}

	public MultipartFile getBandPhoto() {
		return bandPhoto;
	}

	public void setBandPhoto(MultipartFile bandPhoto) {
		this.bandPhoto = bandPhoto;
	}
    
}
