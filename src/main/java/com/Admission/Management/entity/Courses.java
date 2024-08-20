package com.Admission.Management.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Courses")
public class Courses {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="Subject")
	private String Subject;
	
	@Column(name="amount")
	private double amount;
    
	@ManyToOne
	@JoinColumn(name="cLASS")
	@JsonBackReference
	private CLASS cLASS;
	
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Courses(Integer id, String subject, double amount, CLASS cLASS) {
		super();
		this.id = id;
		Subject = subject;
		this.amount = amount;
		this.cLASS = cLASS;
	}



	

	public CLASS getcLASS() {
		return cLASS;
	}



	public void setcLASS(CLASS cLASS) {
		this.cLASS = cLASS;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "Courses [id=" + id + ", Subject=" + Subject + ", amount=" + amount + ", cLASS=" + cLASS + "]";
	}

	
	

}
