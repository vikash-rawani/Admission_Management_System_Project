package com.Admission.Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Admission.Management.entity.CLASS;

public interface CLASSDao  extends JpaRepository<CLASS, Integer>{

}
