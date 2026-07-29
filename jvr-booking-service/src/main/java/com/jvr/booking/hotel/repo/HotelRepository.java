package com.jvr.booking.hotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvr.booking.hotel.model.Hotel;


public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
 
