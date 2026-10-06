package com.jvr.booking.atishbaaziAndFirework.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "atishbaaziAndFirework_details")
public class AtishbaaziAndFirework {
		

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long atishbaaziAndFireworkId;

	    private String businessName;
	    
	    private String ownerName;

	    private String mobile;
	    private String email;
	    
	    @Column(length = 750)
	    private String address;

	    private String pinCode;
	    private String district;
	    private String state;

	    private String occasionTypes; // comma separated
	    
	    private String fireworksTypes;
	    	    
	    private String services; // comma separated

	    private String experience;
	   	    	    
	    private String serviceArea;
	    
	    private String licenseAvailable;

	    private Double approximatePrice;
	    private Boolean termsAccepted;

	    // File paths
	    private String fireworksPhoto;

		public Long getAtishbaaziAndFireworkId() {
			return atishbaaziAndFireworkId;
		}

		public void setAtishbaaziAndFireworkId(Long atishbaaziAndFireworkId) {
			this.atishbaaziAndFireworkId = atishbaaziAndFireworkId;
		}

		public String getBusinessName() {
			return businessName;
		}

		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}

		public String getOwnerName() {
			return ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
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

		public String getOccasionTypes() {
			return occasionTypes;
		}

		public void setOccasionTypes(String occasionTypes) {
			this.occasionTypes = occasionTypes;
		}

		public String getFireworksTypes() {
			return fireworksTypes;
		}

		public void setFireworksTypes(String fireworksTypes) {
			this.fireworksTypes = fireworksTypes;
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

		public String getServiceArea() {
			return serviceArea;
		}

		public void setServiceArea(String serviceArea) {
			this.serviceArea = serviceArea;
		}

		public String getLicenseAvailable() {
			return licenseAvailable;
		}

		public void setLicenseAvailable(String licenseAvailable) {
			this.licenseAvailable = licenseAvailable;
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

		public String getFireworksPhoto() {
			return fireworksPhoto;
		}

		public void setFireworksPhoto(String fireworksPhoto) {
			this.fireworksPhoto = fireworksPhoto;
		}
	    
}
