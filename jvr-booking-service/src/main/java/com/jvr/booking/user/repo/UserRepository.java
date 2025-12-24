package com.jvr.booking.user.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvr.booking.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);

}