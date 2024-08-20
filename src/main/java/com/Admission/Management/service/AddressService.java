package com.Admission.Management.service;

import java.util.List;

import com.Admission.Management.entity.Address;
import com.Admission.Management.entity.Student;

public interface AddressService {
	
	public List<Address> getAddressByStudent(Student student);
	public Address getAddressById(int id);

}
