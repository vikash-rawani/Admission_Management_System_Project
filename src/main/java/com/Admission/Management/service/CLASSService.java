package com.Admission.Management.service;

import com.Admission.Management.entity.CLASS;

public interface CLASSService {
	
	public CLASS addCLASS(CLASS cLASSS);
	public CLASS getClassDetailsByClass(int id);
	public CLASS updateClass(CLASS cLASS);

}
