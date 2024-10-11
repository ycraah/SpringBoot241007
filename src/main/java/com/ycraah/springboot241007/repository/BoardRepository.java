package com.ycraah.springboot241007.repository;

import com.ycraah.springboot241007.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
