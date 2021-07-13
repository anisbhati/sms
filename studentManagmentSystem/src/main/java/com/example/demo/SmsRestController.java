package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsRestController {
	
	   @RequestMapping("/test")
	  public String getTest() {
		  return "its in test mood";
	  }
      
	   @RequestMapping("/getappname")
	  public String returnApplicationnm() {
		  return "application name";
	  }
	
	 @RequestMapping("/getappport")
	  public String returnApplicationport() {
		  return "8080";
	  }
}
