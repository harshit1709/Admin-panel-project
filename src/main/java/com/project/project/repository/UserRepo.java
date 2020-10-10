package com.project.project.repository;
import com.project.project.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepo extends MongoRepository<User, String> {
	
	//public User FindbyEmail(String Email);

}
