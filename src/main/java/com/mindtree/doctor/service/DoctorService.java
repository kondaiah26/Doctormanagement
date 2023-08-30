package com.mindtree.doctor.service;

import java.util.List;

import com.mindtree.doctor.entity.Doctor;

public interface DoctorService {
	public Doctor addDoctor(Doctor doctor);
	public Doctor getDoctorById(int id);
	public List<Doctor> getAllDoctors();
	public Doctor updateDoctor(Doctor doctor);
	public String deleteDoctor(int id);

}
