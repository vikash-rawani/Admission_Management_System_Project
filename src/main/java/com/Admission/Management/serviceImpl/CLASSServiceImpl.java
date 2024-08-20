package com.Admission.Management.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Admission.Management.dao.CLASSDao;
import com.Admission.Management.entity.CLASS;
import com.Admission.Management.service.CLASSService;

@Service
public class CLASSServiceImpl implements CLASSService {
	
	@Autowired
	public CLASSDao cLASSDao;
	@Override
	public CLASS addCLASS(CLASS cLASS) {
		if(cLASSDao.findById(cLASS.getId())==null) {
			
			cLASSDao.save(cLASS);
			   return cLASSDao.findById(cLASS.getId()).get();}
			return null;
	}

	@Override
	public CLASS getClassDetailsByClass(int id) {
		return cLASSDao.findById(id).orElse(null);
		
	}

	@Override
	public CLASS updateClass(CLASS cLASS) {
		if(cLASSDao.findById(cLASS.getId())!=null) {
			cLASSDao.save(cLASS);
			   return cLASSDao.findById(cLASS.getId()).get();}
			return null;
	}

}
