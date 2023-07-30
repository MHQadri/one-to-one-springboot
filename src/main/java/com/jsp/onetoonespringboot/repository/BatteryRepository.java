package com.jsp.onetoonespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.onetoonespringboot.dto.Battery;

public interface BatteryRepository extends JpaRepository<Battery, Integer> {

}
