package com.jvr.booking.catering.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "catering_details")
public class Catering {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long cateringId;

	    private String cateringName;
	    
	    private String cateringOwnerName;

	    private String mobile;
	    private String email;
	    
	    @Column(length = 750)
	    private String address;

	    private String pinCode;
	    private String district;
	    private String state;

	    private String foodType; 
	    
	    private String facilityType; // comma separated
	    
	    private String functionType; // comma separated

	   	    	    
	    private String areaRangeCover;

	    private Double approximatePrice;
	    private Boolean commissionAccepted;

	    // File paths
	    private String cateringPhoto;

		public Long getCateringId() {
			return cateringId;
		}

		public void setCateringId(Long cateringId) {
			this.cateringId = cateringId;
		}

		public String getCateringName() {
			return cateringName;
		}

		public void setCateringName(String cateringName) {
			this.cateringName = cateringName;
		}

		public String getCateringOwnerName() {
			return cateringOwnerName;
		}

		public void setCateringOwnerName(String cateringOwnerName) {
			this.cateringOwnerName = cateringOwnerName;
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

		public String getFoodType() {
			return foodType;
		}

		public void setFoodType(String foodType) {
			this.foodType = foodType;
		}

		public String getFacilityType() {
			return facilityType;
		}

		public void setFacilityType(String facilityType) {
			this.facilityType = facilityType;
		}

		public String getFunctionType() {
			return functionType;
		}

		public void setFunctionType(String functionType) {
			this.functionType = functionType;
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

		public String getCateringPhoto() {
			return cateringPhoto;
		}

		public void setCateringPhoto(String cateringPhoto) {
			this.cateringPhoto = cateringPhoto;
		}

}
