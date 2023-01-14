package com.Student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Student.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {
	

}
