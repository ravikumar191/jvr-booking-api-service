package com.jvr.booking.booking.car.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle_details")
public class Vehicle {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long vehicleId;

	    private String ownerName;
	    private String vehicleName;
	    private String vehicleModel;
	    private String vehicleNumber;

	    @Column(length = 500)
	    private String address;

	    private String pinCode;
	    private String district;
	    private String state;
	    private String bookingArea;

	    private String mobile;
	    private String email;

	    private String services; // comma separated
	    private Double expectedPrice;
	    private Boolean commissionAccepted;

	    // File paths
	    private String vehiclePhoto;
	    private String rcDocument;
	    private String driverLicense;

	    
	 // ===== Getters and Setters =====

	    public Long getVehicleId() {
	        return vehicleId;
	    }

	    public void setVehicleId(Long vehicleId) {
	        this.vehicleId = vehicleId;
	    }

	    public String getOwnerName() {
	        return ownerName;
	    }

	    public void setOwnerName(String ownerName) {
	        this.ownerName = ownerName;
	    }

	    public String getVehicleName() {
	        return vehicleName;
	    }

	    public void setVehicleName(String vehicleName) {
	        this.vehicleName = vehicleName;
	    }

	    public String getVehicleModel() {
	        return vehicleModel;
	    }

	    public void setVehicleModel(String vehicleModel) {
	        this.vehicleModel = vehicleModel;
	    }

	    public String getVehicleNumber() {
	        return vehicleNumber;
	    }

	    public void setVehicleNumber(String vehicleNumber) {
	        this.vehicleNumber = vehicleNumber;
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

	    public String getServices() {
	        return services;
	    }

	    public void setServices(String services) {
	        this.services = services;
	    }

	    public Double getExpectedPrice() {
	        return expectedPrice;
	    }

	    public void setExpectedPrice(Double expectedPrice) {
	        this.expectedPrice = expectedPrice;
	    }

	    public Boolean getCommissionAccepted() {
	        return commissionAccepted;
	    }

	    public void setCommissionAccepted(Boolean commissionAccepted) {
	        this.commissionAccepted = commissionAccepted;
	    }

	    public String getVehiclePhoto() {
	        return vehiclePhoto;
	    }

	    public void setVehiclePhoto(String vehiclePhoto) {
	        this.vehiclePhoto = vehiclePhoto;
	    }

	    public String getRcDocument() {
	        return rcDocument;
	    }

	    public void setRcDocument(String rcDocument) {
	        this.rcDocument = rcDocument;
	    }

	    public String getDriverLicense() {
	        return driverLicense;
	    }

	    public void setDriverLicense(String driverLicense) {
	        this.driverLicense = driverLicense;
	    }
}