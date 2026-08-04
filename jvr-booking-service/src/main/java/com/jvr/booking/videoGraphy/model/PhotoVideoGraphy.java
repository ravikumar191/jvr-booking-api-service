package com.jvr.booking.videoGraphy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "studio_details")
public class PhotoVideoGraphy {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long studioId;

	    private String studioName;
	    
	    private String ownerName;

	    private String mobile;
	    private String email;
	    
	    @Column(length = 750)
	    private String address;

	    private String pinCode;
	    private String district;
	    private String state;

	    private String services; // comma separated
	    
	    private String categories; // comma separated
	    
	    private String equipment; // comma separated

	   	    	    
	    private String areaRangeCover;

	    private Double approximatePrice;
	    private Boolean commissionAccepted;

	    // File paths
	    private String studioPhoto;

		public Long getStudioId() {
			return studioId;
		}

		public void setStudioId(Long studioId) {
			this.studioId = studioId;
		}

		public String getStudioName() {
			return studioName;
		}

		public void setStudioName(String studioName) {
			this.studioName = studioName;
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

		public String getServices() {
			return services;
		}

		public void setServices(String services) {
			this.services = services;
		}

		public String getCategories() {
			return categories;
		}

		public void setCategories(String categories) {
			this.categories = categories;
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

		public String getStudioPhoto() {
			return studioPhoto;
		}

		public void setStudioPhoto(String studioPhoto) {
			this.studioPhoto = studioPhoto;
		}
	    
	    
}
