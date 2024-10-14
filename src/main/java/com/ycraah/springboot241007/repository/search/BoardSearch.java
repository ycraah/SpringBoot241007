package com.ycraah.springboot241007.repository.search;

import com.ycraah.springboot241007.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardSearch {
  Page<Board> search1(Pageable pageagle);
}
