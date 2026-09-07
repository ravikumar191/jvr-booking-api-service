package com.jvr.booking.arkestra.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "akestra_details")
public class Arkestra {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long arkestraId;

	    private String groupName;
	    
	    private String ownerName;

	    private String mobile;
	    private String email;
	    
	    @Column(length = 750)
	    private String address;

	    private String pinCode;
	    private String district;
	    private String state;

	    private String experience; 
	    
	    private String totalMembers; 
	 	    
	    private String type; // comma separated
	    
	    private String performanceType; // comma separated
	    
	    private String functionAvailable; // comma separated
	   	    	    
	    private String bookingArea;

	    private Double approximatePrice;
	    private Boolean commissionAccepted;

	    // File paths
	    private String danceGroupLogo;

		public Long getArkestraId() {
			return arkestraId;
		}

		public void setArkestraId(Long arkestraId) {
			this.arkestraId = arkestraId;
		}

		public String getGroupName() {
			return groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
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

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPerformanceType() {
			return performanceType;
		}

		public void setPerformanceType(String performanceType) {
			this.performanceType = performanceType;
		}

		public String getFunctionAvailable() {
			return functionAvailable;
		}

		public void setFunctionAvailable(String functionAvailable) {
			this.functionAvailable = functionAvailable;
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

		public String getDanceGroupLogo() {
			return danceGroupLogo;
		}

		public void setDanceGroupLogo(String danceGroupLogo) {
			this.danceGroupLogo = danceGroupLogo;
		}
	    
	    
}

