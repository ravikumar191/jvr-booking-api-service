package com.jvr.booking.standUpComedian.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "standUpComedian_details")
public class StandUpComedian {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long comedianId;

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
	    private String comedianPhoto;

		public Long getComedianId() {
			return comedianId;
		}

		public void setComedianId(Long comedianId) {
			this.comedianId = comedianId;
		}

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

		public String getComedianPhoto() {
			return comedianPhoto;
		}

		public void setComedianPhoto(String comedianPhoto) {
			this.comedianPhoto = comedianPhoto;
		}
	    
}
