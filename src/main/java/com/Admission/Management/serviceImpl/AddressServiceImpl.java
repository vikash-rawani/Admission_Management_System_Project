package com.Admission.Management.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Admission.Management.dao.AddressDao;
import com.Admission.Management.entity.Address;
import com.Admission.Management.entity.Student;
import com.Admission.Management.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressDao addressDao;

	@Override
	public List<Address> getAddressByStudent(Student student) {
		
		return addressDao.findByStudent(student.getId());
		
	}

	@Override
	public Address getAddressById(int id) {
		return addressDao.findById(id);
	}

}
