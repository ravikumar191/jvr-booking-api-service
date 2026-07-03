package com.jvr.booking.booking.car.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvr.booking.booking.car.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	

	
}

