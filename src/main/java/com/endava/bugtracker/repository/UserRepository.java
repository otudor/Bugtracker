package com.endava.bugtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endava.bugtracker.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
