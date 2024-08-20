package com.Admission.Management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Admission.Management.entity.Courses;

public interface CoursesDao extends JpaRepository<Courses, Integer> {
	
	public Courses findById(int id);

}
