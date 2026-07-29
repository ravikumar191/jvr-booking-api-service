package com.jvr.booking.singer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvr.booking.singer.model.Singer;


public interface SingerRepository extends JpaRepository<Singer, Long> {

}
