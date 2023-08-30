package com.mindtree.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.doctor.entity.Doctor;
import com.mindtree.doctor.repository.DoctorRepository;
@Service
public class DoctorServiceImplementation implements DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;

	public Doctor addDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	@Override
	public Doctor getDoctorById(int id) {

		return doctorRepository.findById(id).orElse(null);
	}

	@Override
	public List<Doctor> getAllDoctors() {

		return doctorRepository.findAll();
	}
	public Doctor updateDoctor(Doctor doctor) {
		Doctor doc=doctorRepository.findById(doctor.getDId()).orElse(null);
		doc.setDName(doctor.getDEmail());
		doc.setDName(doctor.getDName());
		doc.setDSpecialisation(doctor.getDSpecialisation());
		doc.setDId(doctor.getDId());
		
		return doctorRepository.save(doc) ;
	}

	public String deleteDoctor(int id) {
		doctorRepository.deleteById(id);
		return "doctor removed from db";
	}



}
