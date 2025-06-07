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
	public Iterable<Doctor> showAllDoctorById(Iterable<Integer> id);
	Optional<Doctor> getSingleDoctor(Integer id);
	//update the doctor details - full update -- use Save() method
	//String registerOrUpdateDoctor(Doctor doctor);
	
	public String deleteDoctorById(Integer id);
	public String deleteDoctor(Doctor doctor);
	public String removeAllDoctor();
	public String removeDoctorByIds(Iterable<Integer> ids);
	
}