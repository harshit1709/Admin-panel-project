package com.project.project.repository;
import com.project.project.model.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface StaffRepo extends MongoRepository<Staff, String> {

}
