package com.jvr.booking.bouncer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvr.booking.bouncer.model.Bouncer;


public interface BouncerRepository extends JpaRepository<Bouncer,Long> {

}
