package com.mindtree.doctor.entity;






import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Patient {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int pId;
	private String name;
	private String disease;
	private String address;

}
