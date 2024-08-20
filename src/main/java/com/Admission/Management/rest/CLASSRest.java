package com.Admission.Management.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Admission.Management.entity.CLASS;


public interface CLASSRest {
	
	
	 @PostMapping(path ="/add")
	 public ResponseEntity<CLASS> addNewClass(@RequestBody(required = true) CLASS cLASS);
	 
	 @GetMapping(path = "/getDetails/{id}")
	 public ResponseEntity<CLASS> getClassDetails(@PathVariable Integer id);
	 
	 @PutMapping(path = "/update")
	 public ResponseEntity<CLASS> updateStudent(@RequestBody(required = true) CLASS cLASS);



}
