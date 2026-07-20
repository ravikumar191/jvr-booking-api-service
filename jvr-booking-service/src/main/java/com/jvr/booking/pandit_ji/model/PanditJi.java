package com.jvr.booking.pandit_ji.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pandit_ji_details")
public class PanditJi {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long panditJiId;

	    private String panditJiName;
	    
	    @Column(length = 750)
	    private String address;

	    private String mobile;
	    private String email;
	    

	    private String pinCode;
	    private String district;
	    private String state;
	    
	    private int experience;

	    private String typesOfPoojaPerform; // comma separated

	    private String LanguagesKnown; // comma separated
	    
	   	    
	    private String areaRangeCover;

	    private Double approximatePrice;
	    private Boolean commissionAccepted;

	    // File paths
	    private String panditJiPhoto;

		public Long getPanditJiId() {
			return panditJiId;
		}

		public void setPanditJiId(Long panditJiId) {
			this.panditJiId = panditJiId;
		}

		public String getPanditJiName() {
			return panditJiName;
		}

		public void setPanditJiName(String panditJiName) {
			this.panditJiName = panditJiName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
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

		public int getExperience() {
			return experience;
		}

		public void setExperience(int experience) {
			this.experience = experience;
		}

		public String getTypesOfPoojaPerform() {
			return typesOfPoojaPerform;
		}

		public void setTypesOfPoojaPerform(String typesOfPoojaPerform) {
			this.typesOfPoojaPerform = typesOfPoojaPerform;
		}

		public String getLanguagesKnown() {
			return LanguagesKnown;
		}

		public void setLanguagesKnown(String languagesKnown) {
			LanguagesKnown = languagesKnown;
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

		public String getPanditJiPhoto() {
			return panditJiPhoto;
		}

		public void setPanditJiPhoto(String panditJiPhoto) {
			this.panditJiPhoto = panditJiPhoto;
		}

}

