package com.dateandtime.google.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/features")
public class FunController {
	@GetMapping("/date")
	public Date getDate() {
		return new Date();
	}
	
	@GetMapping("/location")
	public String getLocation() {
		return "Hyderabad";
	}
	@GetMapping("/dateandtime")
	public String getDateTime() {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   return dtf.format(now);
	}
	
}
