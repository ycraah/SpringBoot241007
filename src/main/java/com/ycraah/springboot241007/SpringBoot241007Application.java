package com.ycraah.springboot241007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBoot241007Application {

  public static void main(String[] args) {
    SpringApplication.run(SpringBoot241007Application.class, args);
  }
}
