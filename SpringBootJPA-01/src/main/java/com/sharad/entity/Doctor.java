package com.sharad.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name="JPA_DOCTOR_INFO")
//@AllArgsConstructor
public class Doctor {

	@Id
	@Column(name="doc_id")
	//@GeneratedValue(strategy =GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doc_seq")
	@SequenceGenerator(name = "doc_seq", sequenceName = "doctor_seq", allocationSize = 1)
	private Integer docId;
	
	@Column(name="DOC_NAME" ,length=25)
	private String docName;
	@Column(name="SPECIALIZATION",length=20)
	private String specialization;
	@Column(name="DOC_INCOME")
	private double income;
	

}
