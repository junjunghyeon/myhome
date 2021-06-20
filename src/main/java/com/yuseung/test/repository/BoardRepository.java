/**
 * 
 */
package com.yuseung.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuseung.test.model.Board;

/**
 * @author bbohi
 *
 */
public interface BoardRepository extends JpaRepository<Board, Long> {
	List<Board> findByTitle(String title);
	List<Board> findByTitleOrContent(String title, String content);
}
