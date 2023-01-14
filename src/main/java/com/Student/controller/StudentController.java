package com.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Student.model.Student;
import com.Student.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody Student student) {
		repo.save(student);
		return "Added.";	
	}
	
	@GetMapping("/findAllStudents")
	public List<Student> getStudents(){
		return repo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		repo.deleteById(id);
		return "Deleted.";
	}
	
	
	
}
