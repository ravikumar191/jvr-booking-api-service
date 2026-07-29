package com.jvr.booking.vehicle.dto;

import org.springframework.web.multipart.MultipartFile;

public class VehicleRequest {
	
	    private String ownerName;
	    private String vehicleName;
	    private String vehicleModel;
	    private String vehicleNumber;
	    private String address;
	    private String pinCode;
	    private String district;
	    private String state;
	    private String bookingArea;
	    private String mobile;
	    private String email;
	    private String services;
	    private Double expectedPrice;
	    private Boolean commissionAccepted;

	    private MultipartFile vehiclePhoto;
	    private MultipartFile rcDocument;
	    private MultipartFile driverLicense;


	 // ===== Getters and Setters =====

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


	    public MultipartFile getVehiclePhoto() {
	        return vehiclePhoto;
	    }

	    public void setVehiclePhoto(MultipartFile vehiclePhoto) {
	        this.vehiclePhoto = vehiclePhoto;
	    }

	    public MultipartFile getRcDocument() {
	        return rcDocument;
	    }

	    public void setRcDocument(MultipartFile rcDocument) {
	        this.rcDocument = rcDocument;
	    }

	    public MultipartFile getDriverLicense() {
	        return driverLicense;
	    }

	    public void setDriverLicense(MultipartFile driverLicense) {
	        this.driverLicense = driverLicense;
	    }
}
