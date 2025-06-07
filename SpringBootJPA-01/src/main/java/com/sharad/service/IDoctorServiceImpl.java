package com.sharad.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

	@Override
	public boolean isDoctorAvailable(Integer id) {
		boolean existsById = doctorRepo.existsById(id);
		return existsById ;
	}

	@Override
	public String registerDoctorBatch(List<Doctor> list) {
		Iterable<Doctor> doctorList = doctorRepo.saveAll(list);
//		List<Integer> ids = StreamSupport.stream(doctorList.spliterator(), false).map(Doctor::getDocId).collect(Collectors.toList());
		List<Integer> ids= new ArrayList<Integer>();
		doctorList.forEach(doctor->{
			ids.add(doctor.getDocId());
		});
		return ids.size() +" no. of Doctor are registerd having the id : "+ ids.toString();
	}

	@Override
	public long fetchDoctorCount() {
		long count = doctorRepo.count();
		return count;
	}

	@Override
	public Iterable<Doctor> findAllDoctor() {
		
		return doctorRepo.findAll();
	}

	@Override
	public Optional<Doctor> getSingleDoctor(Integer id) {
		Optional<Doctor> option = doctorRepo.findById(id);
		if(option.isPresent()) {
			return option;
			}else {
				return Optional.empty();
			}
	}

	@Override
	public Iterable<Doctor> showAllDoctorById(Iterable<Integer> id) {
		Iterable<Doctor> allDoctor = doctorRepo.findAllById(id);
		return allDoctor;
	}

}
