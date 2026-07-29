package com.jvr.booking.vehicle.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvr.booking.vehicle.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	

	
}

