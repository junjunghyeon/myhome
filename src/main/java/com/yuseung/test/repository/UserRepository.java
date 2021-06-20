package com.yuseung.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yuseung.test.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
	
	@EntityGraph(attributePaths = { "boards" })
	List<User> findAll();
}
