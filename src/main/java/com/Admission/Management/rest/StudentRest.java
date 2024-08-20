package com.Admission.Management.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Admission.Management.entity.Student;

public interface StudentRest {
	
	 @PostMapping(path ="/addStudent")
	 public ResponseEntity<Student> addNewStudent(@RequestBody(required = true) Student student);
	 
	 @GetMapping(path = "/getStudent/{id}")
	 public ResponseEntity<Student> getStudent(@PathVariable Integer id);
	
	 @GetMapping(path = "/getAllStudent/{id}")
	 public ResponseEntity<List<Student>> getAllStudentOfAClass(@PathVariable Integer id);
	
	 @PutMapping(path = "/updateStudent")
	 public ResponseEntity<Student> updateStudent(@RequestBody(required = true) Student student);

	

}
