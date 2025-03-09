package com.learn.jpa.learnJdbc.entities;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Employee")
@Getter
@Setter
public class Employee {

	@EmbeddedId
	private EmployeeID id;
	
	private String department;
	private String Location;
	private Date dateOfJoin;
	private boolean isActive;
	
}
