package com.jvr.booking.hotel.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;

public class HotelRequest {
	
	    private String hotelName;
	    
	    private String hotelOwnerName;

	    private String mobile;
	    private String email;
	    
	    @Column(length = 500)
	    private String address;

	    private String pinCode;
	    private String district;
	    private String state;

	    private String FacilitiesProvided; // comma separated

	    private String functionType; // comma separated
	    
       private String managerName;
	    
	    private String managerMobileNumber;

	    private Double approximatePrice;
	    private Boolean commissionAccepted;

	    // File paths
	    private MultipartFile hotelPhoto;

		public String getHotelName() {
			return hotelName;
		}

		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}

		public String getHotelOwnerName() {
			return hotelOwnerName;
		}

		public void setHotelOwnerName(String hotelOwnerName) {
			this.hotelOwnerName = hotelOwnerName;
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

		public String getFacilitiesProvided() {
			return FacilitiesProvided;
		}

		public void setFacilitiesProvided(String facilitiesProvided) {
			FacilitiesProvided = facilitiesProvided;
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

		public MultipartFile getHotelPhoto() {
			return hotelPhoto;
		}

		public void setHotelPhoto(MultipartFile hotelPhoto) {
			this.hotelPhoto = hotelPhoto;
		}

}
