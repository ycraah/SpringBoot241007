package com.ycraah.springboot241007.repository;

import com.ycraah.springboot241007.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<Board, Long>{
  @Query(value="select now()", nativeQuery = true)
  String getTime();
}
