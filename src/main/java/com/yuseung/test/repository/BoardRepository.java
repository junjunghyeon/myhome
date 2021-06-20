/**
 * 
 */
package com.yuseung.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuseung.test.model.Board;

/**
 * @author bbohi
 *
 */
public interface BoardRepository extends JpaRepository<Board, Long> {

}
