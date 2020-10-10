package com.project.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.project.model.Batches;

public interface BatchRepo extends MongoRepository<Batches, String> {

}
