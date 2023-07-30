package com.jsp.onetoonespringboot.dto;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data

public class Battery {

	@Id
	@Column(name = "serialnumber")
	private int batterySerialNumber;
	@Column(name = "voltage")
	private int batteryVoltage;
	private String manufacturer;
	private int capacity;
	@UpdateTimestamp
	private LocalDate manufactureDate;

	@OneToOne(mappedBy = "battery")
	@JsonManagedReference
	private Laptop laptop;
}
