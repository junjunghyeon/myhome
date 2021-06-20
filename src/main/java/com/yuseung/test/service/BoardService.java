/**
 * 
 */
package com.yuseung.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuseung.test.model.Board;
import com.yuseung.test.model.User;
import com.yuseung.test.repository.BoardRepository;
import com.yuseung.test.repository.UserRepository;

/**
 * @author bbohi
 *
 */
@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public Board save(String username, Board board) {
		User user = userRepository.findByUsername(username);
		board.setUser(user);
		return boardRepository.save(board);
	}
}
