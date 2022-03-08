package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modelpackage.User;

public interface UserRepository extends JpaRepository<User, Integer> { //


	User findByusername(String username);// generate query. searches in username column
	
// searches in user table with the given user name. 
}
