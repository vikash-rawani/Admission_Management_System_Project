package com.Admission.Management.service;

import java.util.List;

import com.Admission.Management.entity.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	public Student getStudentById(int id);
	public List<Student> getAllStudentByClass(int cl);
	public Student updateStudent(Student student);
	

}
