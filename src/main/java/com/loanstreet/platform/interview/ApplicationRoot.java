package com.loanstreet.platform.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/")
public class ApplicationRoot {

  @GetMapping("/")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<String> applicationRoot() {
    return new ResponseEntity<String>("Welcome to the Platform team!", HttpStatus.OK);
  }

  @GetMapping("/health")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<String> healthCheck() {
    return new ResponseEntity<String>("Application is healthy", HttpStatus.OK);
  }

}
