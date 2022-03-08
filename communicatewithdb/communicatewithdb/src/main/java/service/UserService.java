package service;

import org.springframework.beans.factory.annotation.Autowired;

import datatranferobject.LoginDto;
import datatranferobject.LoginResponseDto;
import modelpackage.User;
import repository.UserRepository;

public class UserService {
	// to pass logic of program, manipulation of program done in service.  
@Autowired
UserRepository userRepository;

	public LoginResponseDto login(LoginDto loginDto) {
	LoginResponseDto loginResponseDto= new LoginResponseDto();
	String username= loginDto.getUsername();
	String password=loginDto.getPassword();
	User user=userRepository.findByusername(username);
	
	if(user==null) {
		loginResponseDto.setStatus("401");
		loginResponseDto.setMessage("user not found");
	}
	
	String passwordFromDB=user.getPassword();
	if(password.equals(passwordFromDB)) {
		loginResponseDto.setStatus("200");
		loginResponseDto.setMessage("Authorized");
	}
	else if(!password.equals(passwordFromDB)){
		loginResponseDto.setStatus("401");
		loginResponseDto.setMessage("Unauthorized");
	}
	else {
		loginResponseDto.setStatus("500");
		loginResponseDto.setMessage("Internal Service Error");
	}
		return loginResponseDto;
	}

}
