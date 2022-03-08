package com.example2.secondtry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DayTwo {
	
	@GetMapping("/sukanya")
	public String helloWorld() {
		return "Hello World";
	}

}
