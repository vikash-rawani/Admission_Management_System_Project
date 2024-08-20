package com.Admission.Management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	
	@Column(name="village")
	private String village;
	
	@Column(name="postOffice")
	private String postOffice;
	
	@Column(name="District")
	private String District;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="State")
	private String State;
	
	@Column(name="Country")
	private String Country;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String village, String postOffice, String district, int pincode, String state,
			String country) {
		super();
		this.id = id;
		this.village = village;
		this.postOffice = postOffice;
		District = district;
		this.pincode = pincode;
		State = state;
		Country = country;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", student=" + student + ", village=" + village + ", postOffice=" + postOffice
				+ ", District=" + District + ", pincode=" + pincode + ", State=" + State + ", Country=" + Country + "]";
	}

	
	
	

}
