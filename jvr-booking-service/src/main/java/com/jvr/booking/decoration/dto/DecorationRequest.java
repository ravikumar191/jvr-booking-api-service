package com.jvr.booking.decoration.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;

public class DecorationRequest {
	
	 private String decorationName;
	    
	    private String decorationOwnerName;

	    private String mobile;
	    private String email;
	    
	    @Column(length = 750)
	    private String address;

	    private String pinCode;
	    private String district;
	    private String state;

	    private String decorationType; // comma separated

	    private String facilityType; // comma separated
	    
	    private String functionType; // comma separated

        private String managerName;
	    
	    private String managerMobileNumber;
	    
	    private String areaRangeCover;

	    private Double approximatePrice;
	    private Boolean commissionAccepted;

	    // File paths
	    private MultipartFile decorationPhoto;

		public String getDecorationName() {
			return decorationName;
		}

		public void setDecorationName(String decorationName) {
			this.decorationName = decorationName;
		}

		public String getDecorationOwnerName() {
			return decorationOwnerName;
		}

		public void setDecorationOwnerName(String decorationOwnerName) {
			this.decorationOwnerName = decorationOwnerName;
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

		public String getDecorationType() {
			return decorationType;
		}

		public void setDecorationType(String decorationType) {
			this.decorationType = decorationType;
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

		public MultipartFile getDecorationPhoto() {
			return decorationPhoto;
		}

		public void setDecorationPhoto(MultipartFile decorationPhoto) {
			this.decorationPhoto = decorationPhoto;
		}

}
