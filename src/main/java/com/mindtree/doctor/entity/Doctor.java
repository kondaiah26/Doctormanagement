package com.mindtree.doctor.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="doctorss")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dId;
	private String dName;
	private String dSpecialisation;
	private String dEmail;
	@OneToMany(targetEntity = Patient.class)
	private List<Patient> patients;
	@OneToOne(targetEntity = Payment.class)
	private Payment payment;
}
