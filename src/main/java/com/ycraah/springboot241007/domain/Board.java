package com.ycraah.springboot241007.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long bno;

  @Column(length=500, nullable=false)
  private String title;

  @Column(length=2000, nullable=false)
  private String content;

  @Column(length = 50, nullable =false)
  private String writer;
}
