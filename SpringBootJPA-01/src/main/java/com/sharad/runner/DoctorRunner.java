package com.sharad.runner;

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
		/*
		 try {
		Doctor doctor= new Doctor();
		doctor.setDocName("Veera");
		doctor.setIncome(500000);
		doctor.setSpecialization("MD-Gyno");
		
		doctorService.registerDoctor(doctor);
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
		
		
		
		/*
		 try {
		boolean flag = doctorService.isDoctorAvailable(6);
			if(flag==true) {
				System.out.println("Doctor Available ");
			}else {
				System.out.println("Docotr not available");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
		
		
		
		/*
		Doctor doctor1= new Doctor();
		doctor1.setDocName("Raju");
		doctor1.setIncome(520000);
		doctor1.setSpecialization("Sceen Specialist");
		
		Doctor doctor2= new Doctor();
		doctor2.setDocName("Manish");
		doctor2.setIncome(4000000);
		doctor2.setSpecialization("Sexual Specialist ");
		
		Doctor doctor3= new Doctor();
		doctor3.setDocName("Ramesh");
		doctor3.setIncome(300000);
		doctor3.setSpecialization("Dentist ");
		
		List<Doctor> list= List.of(doctor1,doctor2,doctor3);
		
		try {
			String registerDoctorBatch = doctorService.registerDoctorBatch(list);
			System.out.println(registerDoctorBatch);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		
		
		/*
		try {
		long noOfDoctor = doctorService.fetchDoctorCount();
		System.out.println("Count of doctor Record :"+ noOfDoctor);
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			Iterable<Doctor> allDoctor = doctorService.findAllDoctor();
			allDoctor.forEach(doctor->{
				System.out.println(doctor);
			});
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	
			try {
				Optional<Doctor> singleDoctor = doctorService.getSingleDoctor(5);
				System.out.println(singleDoctor);
			}catch(Exception e) {
				e.printStackTrace();
			}
			*/
		
		Iterable<Doctor> doctorList = doctorService.showAllDoctorById(List.of(2,1,5,7,50));
		doctorList.forEach(doctor->{
			System.out.println(doctor);
		});
	}

}
