package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import datatranferobject.LoginDto;
import datatranferobject.LoginResponseDto;
import service.UserService;

@RestController
public class LoginController {
	@Autowired
	UserService userservice ;
	@PostMapping(value="/details", consumes="application/json")
	public LoginResponseDto Login (@RequestBody LoginDto loginDto) {
	return userservice.login(loginDto);

}
	@GetMapping("/test")
	public String LoginGet () {
	return "Hello";

}
}
