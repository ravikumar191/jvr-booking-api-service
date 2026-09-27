package com.jvr.booking.barber.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "barber_details")
public class Barber {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long barberId;

	    private String barberName;
	    
	    private String mobile;
	    private String email;
	    
	    @Column(length = 750)
	    private String address;

	    private String pinCode;
	    private String district;
	    private String state;

	    private String experience; 
	    
	    private String servicesOffered; 
	 	    
	    private String occasionsCovered; // comma separated
	    
	    private String languagesKnown; // comma separated

	   	    	    
	    private String areaRangeCover;

	    private Double approximatePrice;
	    private Boolean commissionAccepted;

	    // File paths
	    private String barberPhoto;

		public Long getBarberId() {
			return barberId;
		}

		public void setBarberId(Long barberId) {
			this.barberId = barberId;
		}

		public String getBarberName() {
			return barberName;
		}

		public void setBarberName(String barberName) {
			this.barberName = barberName;
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

		public String getServicesOffered() {
			return servicesOffered;
		}

		public void setServicesOffered(String servicesOffered) {
			this.servicesOffered = servicesOffered;
		}

		public String getOccasionsCovered() {
			return occasionsCovered;
		}

		public void setOccasionsCovered(String occasionsCovered) {
			this.occasionsCovered = occasionsCovered;
		}

		public String getLanguagesKnown() {
			return languagesKnown;
		}

		public void setLanguagesKnown(String languagesKnown) {
			this.languagesKnown = languagesKnown;
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

		public String getBarberPhoto() {
			return barberPhoto;
		}

		public void setBarberPhoto(String barberPhoto) {
			this.barberPhoto = barberPhoto;
		}
	    
}

