package com.Admission.Management.restImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Admission.Management.dao.CoursesDao;
import com.Admission.Management.entity.Courses;
import com.Admission.Management.rest.CoursesRest;
import com.Admission.Management.serviceImpl.CoursesServiceImpl;

@RestController
public class CoursesRestImpl {
	
	@Autowired
	CoursesServiceImpl coursesDao;
	

	@GetMapping("/Home/{id}")
	public Courses getCourses(@PathVariable("id") int id) {
		//int i=id;
		return coursesDao.getCoursesById(id);
	}

}
