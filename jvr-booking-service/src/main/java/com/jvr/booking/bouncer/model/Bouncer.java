package com.jvr.booking.bouncer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "bouncer_details")
public class Bouncer {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long bouncerAgencyId;

	    private String agencyName;
	    
	    private String agencyOwnerName;

	    private String mobile;
	    private String email;
	    
	    @Column(length = 750)
	    private String address;

	    private String pinCode;
	    private String district;
	    private String state;

	    private String experience; 
	    
	    private String totalMembers; 
	 	    
	    private String bouncerAvailable; // comma separated
	    
	    private String services; // comma separated

	   	    	    
	    private String bookingArea;

	    private Double approximatePrice;
	    private Boolean commissionAccepted;

	    // File paths
	    private String bouncerAgencyPhoto;

		public Long getBouncerAgencyId() {
			return bouncerAgencyId;
		}

		public void setBouncerAgencyId(Long bouncerAgencyId) {
			this.bouncerAgencyId = bouncerAgencyId;
		}

		public String getAgencyName() {
			return agencyName;
		}

		public void setAgencyName(String agencyName) {
			this.agencyName = agencyName;
		}

		public String getAgencyOwnerName() {
			return agencyOwnerName;
		}

		public void setAgencyOwnerName(String agencyOwnerName) {
			this.agencyOwnerName = agencyOwnerName;
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

		public String getBouncerAvailable() {
			return bouncerAvailable;
		}

		public void setBouncerAvailable(String bouncerAvailable) {
			this.bouncerAvailable = bouncerAvailable;
		}

		public String getServices() {
			return services;
		}

		public void setServices(String services) {
			this.services = services;
		}

		public String getBookingArea() {
			return bookingArea;
		}

		public void setBookingArea(String bookingArea) {
			this.bookingArea = bookingArea;
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

		public String getBouncerAgencyPhoto() {
			return bouncerAgencyPhoto;
		}

		public void setBouncerAgencyPhoto(String bouncerAgencyPhoto) {
			this.bouncerAgencyPhoto = bouncerAgencyPhoto;
		}
	    
}

