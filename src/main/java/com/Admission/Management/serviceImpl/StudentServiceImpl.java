package com.Admission.Management.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Admission.Management.dao.StudentDao;
import com.Admission.Management.entity.Student;
import com.Admission.Management.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
    StudentDao studentDao;
	@Override
	public Student addStudent(Student student) {
		if(studentDao.findById(student.getId())==null) {
		   studentDao.save(student);
		   return studentDao.findById(student.getId()).get();}
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		return studentDao.findById(id);
	}

	@Override
	public List<Student> getAllStudentByClass(int cl) {
		return studentDao.findByCl(cl);
	}

	@Override
	public Student updateStudent(Student student) {
		if(studentDao.findById(student.getId())!=null)
		{    
			studentDao.save(student);
			return studentDao.findById(student.getId()).get();
		}
		return null;
	}

}
