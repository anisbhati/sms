package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsRestController {
	
	  public String getTest() {
		  return "its in test mood";
	  }

}
