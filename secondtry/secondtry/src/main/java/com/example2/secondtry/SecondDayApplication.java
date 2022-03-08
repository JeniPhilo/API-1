package com.example2.secondtry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SecondDayApplication implements CommandLineRunner {
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	 private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SecondDayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO student (mark, stud_name, stud_id, dept_id) VALUES ("
                + "94,'Aswin', 21, 4)";
         
        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }
		
	}

}
