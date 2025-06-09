package com.vk.devops.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsApplication {

  @GetMapping(path = "/messege")
   String messege() {
	  return "Hello folks ! vivek here with basic dockerization";
  }
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
