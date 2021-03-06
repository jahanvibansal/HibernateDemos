package com.java.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
//corresponding to this class, i should have a table in db
//doctor table :drop and recreate.
public class Doctor {

	@Id
	//primary key
	int id;
	String name;
	@OneToMany(fetch=FetchType.EAGER)
	List<Address> address;
	long telephoneNumber;
}
