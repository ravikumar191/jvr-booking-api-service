package com.jvr.booking.catering.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvr.booking.catering.model.Catering;

public interface CateringRepository extends JpaRepository<Catering,Long> {

}
