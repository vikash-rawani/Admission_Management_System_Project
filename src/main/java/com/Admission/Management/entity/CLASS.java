package com.Admission.Management.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="CLASS")
public class CLASS {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@OneToMany(mappedBy="cLASS",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonManagedReference
	private List<Courses> courses;

	public CLASS() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CLASS(Integer id, List<Courses> courses) {
		super();
		this.id = id;
		this.courses = courses;
	}


	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "CLASS [id=" + id + ", courses=" + courses + "]";
	}

	
	
	

}
