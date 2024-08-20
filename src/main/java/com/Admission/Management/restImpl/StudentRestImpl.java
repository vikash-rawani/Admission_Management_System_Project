package com.Admission.Management.restImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.Admission.Management.entity.Student;
import com.Admission.Management.rest.StudentRest;
import com.Admission.Management.service.StudentService;
import com.Admission.Management.serviceImpl.StudentServiceImpl;

@RestController
public class StudentRestImpl implements StudentRest {
	@Autowired
	StudentServiceImpl studentService ;

	@Override
	public ResponseEntity<Student> addNewStudent(Student student) {
		try {
            Student responce = studentService.addStudent(student);
            return ResponseEntity.of(Optional.of(responce));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        
	}

	@Override
	public ResponseEntity<Student> getStudent(Integer id) {
		try {
            Student responce = studentService.getStudentById(id);
            return ResponseEntity.of(Optional.of(responce));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}

	@Override
	public ResponseEntity<List<Student>> getAllStudentOfAClass(Integer id) {
		try {
			List<Student> responce = studentService.getAllStudentByClass(id);
            return ResponseEntity.of(Optional.of(responce));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}

	@Override
	public ResponseEntity<Student> updateStudent(Student student) {
		try {
			Student responce = studentService.updateStudent(student);
            return ResponseEntity.of(Optional.of(responce));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}
	
	

}
