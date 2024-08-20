package com.Admission.Management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Admission.Management.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	
	public Student findById(int id);
	public List<Student> findByCl(int cl);
	

}
