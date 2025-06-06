package com.sharad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharad.entity.Doctor;
import com.sharad.repository.IDoctorRepo;

@Service
public class IDoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("doctor id(before save):: " + doctor.getDocId());
		Doctor saveDoc = doctorRepo.save(doctor);
		
		return "Doctor object saved with the id ::"+doctor.getDocId()	;
		}

}
