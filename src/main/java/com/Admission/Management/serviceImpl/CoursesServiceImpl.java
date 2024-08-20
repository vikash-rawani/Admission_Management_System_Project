package com.Admission.Management.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Admission.Management.dao.CoursesDao;
import com.Admission.Management.entity.Courses;
import com.Admission.Management.service.CoursesService;

@Service
public class CoursesServiceImpl implements CoursesService{
	
	@Autowired
	CoursesDao coursesDao;

	@Override
	public Courses getCoursesById(int id) {
		return coursesDao.findById(id);
	}

	

}
