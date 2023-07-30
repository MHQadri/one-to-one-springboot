package com.jsp.onetoonespringboot.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Laptop {

	@Id
	private int laptopId;
	private String laptopName;
	private double laptopPrice;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private Battery battery;
}
