package com.Admission.Management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Admission.Management.entity.Address;


public interface AddressDao extends JpaRepository<Address, Integer> {
	@Query("select u from Address u where u.student=:n")
	public List<Address> findByStudent(@Param("n") int student_id);
	public Address findById(int id);

}
