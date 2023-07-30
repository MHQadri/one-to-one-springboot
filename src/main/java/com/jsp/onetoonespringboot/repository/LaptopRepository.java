package com.jsp.onetoonespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.onetoonespringboot.dto.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer>{
	
}
