package com.ycraah.springboot241007.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@Log4j2
public class SampleController {
  @GetMapping("/hello")
  public String hello(Model model) {
    log.info("hello");
    model.addAttribute("msg", "Hello World");
    return "hello";
  }

  @GetMapping("/ex/ex1")
  public String ex1(Model model) {
    List<String> list = Arrays.asList("AAA", "BBB", "CCC", "DDD");
    model.addAttribute("list", list);
    return "/ex/ex1";
  }

  @GetMapping("/ex/ex3")
  public String ex3(Model model) {
    model.addAttribute("list", Arrays.asList("AAA", "BBB", "CCC", "DDD"));
    return "/ex/ex3";
  }
}
