package com.Admission.Management.restImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.Admission.Management.entity.CLASS;
import com.Admission.Management.entity.Student;
import com.Admission.Management.rest.CLASSRest;
import com.Admission.Management.service.CLASSService;
import com.Admission.Management.serviceImpl.CLASSServiceImpl;

@RestController
public class CLASSRestImpl implements CLASSRest {
	
	@Autowired
	CLASSServiceImpl cLASSService;

	@Override
	public ResponseEntity<CLASS> addNewClass(CLASS cLASS) {
		try {
            CLASS responce = cLASSService.addCLASS(cLASS);
            if(responce==null)
            {
            	ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
            }
            return ResponseEntity.of(Optional.of(responce));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}

	@Override
	public ResponseEntity<CLASS> getClassDetails(Integer id) {
		try {
            CLASS responce = cLASSService.getClassDetailsByClass(id);
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

	@Override
	public ResponseEntity<CLASS> updateStudent(CLASS cLASS) {
		try {
            CLASS responce = cLASSService.updateClass(cLASS);
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
