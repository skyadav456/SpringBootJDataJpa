package com.sharad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sharad.entity.Doctor;

@Repository
public interface IDoctorRepo extends CrudRepository<Doctor, Integer> {
	
	

}
