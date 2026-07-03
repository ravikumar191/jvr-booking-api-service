package com.jvr.booking.booking.singer.dto;

import org.springframework.web.multipart.MultipartFile;


public class SingerRequest {
	
	 private String singerName;

	    private String bookingArea;

	    private String mobile;
	    private String email;
	    
	    private String typeOfSinger;

	    private String managerName;
	    
	    private String managerMobileNumber;


	    private String functionType; // comma separated
	    private Double approximatePrice;
	    private Boolean commissionAccepted;

	    // File paths
	    private MultipartFile singerPhoto;

		public String getSingerName() {
			return singerName;
		}

		public void setSingerName(String singerName) {
			this.singerName = singerName;
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

		public String getTypeOfSinger() {
			return typeOfSinger;
		}

		public void setTypeOfSinger(String typeOfSinger) {
			this.typeOfSinger = typeOfSinger;
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

		public MultipartFile getSingerPhoto() {
			return singerPhoto;
		}

		public void setSingerPhoto(MultipartFile singerPhoto) {
			this.singerPhoto = singerPhoto;
		}

}
