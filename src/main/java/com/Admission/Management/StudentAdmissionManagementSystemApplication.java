package com.Admission.Management;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.Admission.Management.dao.CLASSDao;
import com.Admission.Management.dao.CoursesDao;
import com.Admission.Management.entity.CLASS;
import com.Admission.Management.entity.Courses;
@ComponentScan(basePackages = {"com.Admission.Management.serviceImpl","com.Admission.Management.restImpl","com.Admission.Management.service"})
@SpringBootApplication
public class StudentAdmissionManagementSystemApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentAdmissionManagementSystemApplication.class, args);
		CLASSDao c =context.getBean(CLASSDao.class);
		CoursesDao cu =context.getBean(CoursesDao.class);
		CLASS cs= new CLASS();
		Courses s= new Courses();
		s.setAmount(24);
		s.setSubject("Hindi");
		s.setcLASS(cs);
		Courses s1= new Courses();
		s1.setAmount(25);
		s1.setSubject("Hindi1");
		s1.setcLASS(cs);
		Courses s2= new Courses();
		s2.setAmount(26);
		s2.setSubject("Hindi2");
		s2.setcLASS(cs);
		List<Courses> l= new ArrayList<Courses>();
		l.add(s);
		l.add(s1);
		l.add(s2);
		
		
		cs.setCourses(l);
		c.save(cs);
		c.save(c.save(cs));
		//System.out.println(c.findByIde(402));
		
	}

}
