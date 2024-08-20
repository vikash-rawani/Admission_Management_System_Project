package com.Admission.Management.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Admission.Management.entity.Courses;


public interface CoursesRest {
	
	@GetMapping(path = "/getCoursesById/{id}")
    public Courses getCourses(@PathVariable Integer id);
	

}
