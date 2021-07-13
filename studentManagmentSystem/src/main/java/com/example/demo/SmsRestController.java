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
	   
	   @RequestMapping("/getappnamewithport")
		  public String returnApplicationnmwport() {
			  return "application name  8080";
		  }
}
