package com.Admission.Management.restImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.Admission.Management.entity.Address;
import com.Admission.Management.entity.Student;
import com.Admission.Management.rest.AddressRest;
import com.Admission.Management.serviceImpl.AddressServiceImpl;

@RestController
public class AddressRestImpl implements AddressRest {
	
	@Autowired
	AddressServiceImpl addressService;

	@Override
	public ResponseEntity<List<Address>> getAddressByStudent(Student student) {
		try {
            List<Address> responce = addressService.getAddressByStudent(student);
            if(responce.size()==0)
            {
            	ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.of(Optional.of(responce));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}

	@Override
	public ResponseEntity<Address> getAddressById(Integer id) {
		try {
            Address responce = addressService.getAddressById(id);
            if(responce==null)
            {
            	ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.of(Optional.of(responce));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}

}
