package com.sharad.runner;

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
		/*try {
		Doctor doctor= new Doctor();
		doctor.setDocName("Veera");
		doctor.setIncome(500000);
		doctor.setSpecialization("MD-Gyno");
		
		doctorService.registerDoctor(doctor);
		}catch(Exception e){
			e.printStackTrace();
		}*/
		
		

	}

}
