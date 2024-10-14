package com.ycraah.springboot241007;

import com.ycraah.springboot241007.domain.Board;
import com.ycraah.springboot241007.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class DataSourceTests {
  @Autowired
  private BoardRepository boardRepository;

  @Test
  public void testPaging() {
   Pageable pageable = PageRequest.of(0, 10, Sort.by("bno").descending());
    Page<Board> result = boardRepository.findAll(pageable);

    log.info("total count: " + result.getTotalElements());
    log.info("total pages: " + result.getTotalPages());
    log.info("page number: " + result.getNumber());
    log.info("page size: " + result.getSize());

    List<Board> todoList = result.getContent();
    todoList.forEach(board -> log.info(board));
  }
}
