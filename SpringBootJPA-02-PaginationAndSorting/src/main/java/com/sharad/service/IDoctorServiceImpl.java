package com.sharad.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
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



	

}
