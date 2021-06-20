package com.yuseung.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuseung.test.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
