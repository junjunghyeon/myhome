/**
 * 
 */
package com.yuseung.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.yuseung.test.model.Role;
import com.yuseung.test.model.User;
import com.yuseung.test.repository.UserRepository;

/**
 * @author bbohi
 *
 */
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User save(User user) {
		String encodePassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodePassword);
		user.setEnabled(true);
		Role role = new Role ();
		role.setId(1L);
		user.getRoles().add(role);
		
		return userRepository.save(user);
	}
}
