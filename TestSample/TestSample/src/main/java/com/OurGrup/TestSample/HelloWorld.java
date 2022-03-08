package com.OurGrup.TestSample;

import javax.annotation.Generated;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {
	
@GetMapping("/sukanya")
public String helloWorld() {
	return "Hello World";
}
}
