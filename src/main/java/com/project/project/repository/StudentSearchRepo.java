package com.project.project.repository;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.project.project.model.Student;

@Repository
public class StudentSearchRepo {
	
	
	@Autowired
    MongoTemplate mongoTemplate;

    
	public Collection<Student> searchStudent(String text) {
        return mongoTemplate.find(Query.query(new Criteria().orOperator(Criteria.where("RollNo").regex(text, "i"),
                                    Criteria.where("name").regex(text, "i"),
                                    Criteria.where("batch").regex(text, "i"),
                                    Criteria.where("email").regex(text, "i"),
                                    Criteria.where("mobile").regex(text, "i"),
                                    Criteria.where("gender").regex(text, "i"),
                                    Criteria.where("DOB").regex(text, "i"),
                                    Criteria.where("AdmissionDate").regex(text, "i"))
                        ), Student.class);
    }

}
