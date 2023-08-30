package com.mindtree.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.doctor.entity.Doctor;
import com.mindtree.doctor.service.DoctorServiceImplementation;
@RestController
public class DoctorController {
	@Autowired
	private DoctorServiceImplementation doctorservice;

	@PostMapping("/addDoctor")
	public ResponseEntity<?> saveDoctor(@RequestBody Doctor doctor) {
		doctorservice.addDoctor(doctor);

		return new ResponseEntity<Doctor>(HttpStatus.ACCEPTED);
	}
	@GetMapping("/doctor/{id}")
	public ResponseEntity<?> getDoctor(@PathVariable int id){
		Doctor d= doctorservice.getDoctorById(id);
		 return new ResponseEntity<Doctor>(d,HttpStatus.OK);
		
	}
	@GetMapping("/allDoctors")
	public ResponseEntity<?> getAllDoctors(){
		List<Doctor > doctor= doctorservice.getAllDoctors();
		return new ResponseEntity<List<Doctor>>(doctor,HttpStatus.OK);
		
	}
	@DeleteMapping("/deleteDoctor/{id}")
	public String deleteDoctor( @PathVariable int id) {
		return doctorservice.deleteDoctor(id);
		
	}
	@PutMapping("/updatedoctor/{id}")
	public Doctor updateDoctor(@RequestBody Doctor doctor){
		return doctorservice.updateDoctor(doctor);
		
	}



}
