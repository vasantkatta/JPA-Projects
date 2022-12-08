package com.vasant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer {

	@Id
	Integer id;
	String name;
	String email;
	
}
