package com.sharad.service;


import java.util.List;
import java.util.Optional;

import com.sharad.entity.Doctor;


public interface IDoctorService {
	
	public String registerDoctor(Doctor doctor);
	public boolean isDoctorAvailable(Integer id);
	public String registerDoctorBatch(List<Doctor> list);
	public long fetchDoctorCount();
	
	public Iterable<Doctor> findAllDoctor();
	 Optional<Doctor> getSingleDoctor(Integer id);
	public Iterable<Doctor> showAllDoctorById(Iterable<Integer> id);
}