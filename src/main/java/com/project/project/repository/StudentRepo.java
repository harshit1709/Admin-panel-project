package com.project.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.project.model.Student;

public interface StudentRepo extends MongoRepository<Student , String> {

}
