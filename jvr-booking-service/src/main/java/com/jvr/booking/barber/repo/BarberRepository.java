package com.jvr.booking.barber.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvr.booking.barber.model.Barber;

public interface BarberRepository extends JpaRepository<Barber,Long> {

}

