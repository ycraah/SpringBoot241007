package com.ycraah.springboot241007;

import com.ycraah.springboot241007.domain.Board;
import com.ycraah.springboot241007.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class DataSourceTests {
  @Autowired
  private BoardRepository boardRepository;

  @Test
  public void testDelete() {
   Long bno = 1L;
   boardRepository.deleteById(bno);
  }
}
