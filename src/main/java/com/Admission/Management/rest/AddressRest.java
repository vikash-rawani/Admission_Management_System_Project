package com.Admission.Management.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Admission.Management.entity.Address;
import com.Admission.Management.entity.Student;

public interface AddressRest {
	
	    @GetMapping(path = "/getAddressByStudent")
	    public ResponseEntity<List<Address>> getAddressByStudent(@RequestBody(required = true) Student student);
	    
	    @GetMapping(path = "/getAddress/{id}")
	    public ResponseEntity<Address> getAddressById(@PathVariable Integer id );

}
