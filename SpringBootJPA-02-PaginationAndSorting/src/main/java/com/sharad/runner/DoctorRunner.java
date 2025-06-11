package com.sharad.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sharad.entity.Doctor;
import com.sharad.service.IDoctorService;

@Component
public class DoctorRunner implements CommandLineRunner {
	@Autowired
	IDoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {
		
	}

}
