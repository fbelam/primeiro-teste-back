package com.login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.login.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
