package com.jsp.onetoonespringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.onetoonespringboot.dao.LaptopBatteryDao;
import com.jsp.onetoonespringboot.dto.Battery;
import com.jsp.onetoonespringboot.dto.Laptop;

@RestController
public class LaptopBatteryController {

	@Autowired
	private LaptopBatteryDao laptopBatteryDao;

	@PostMapping(value = "/saveLaptop")
	public Laptop saveLaptop(@RequestBody Laptop laptop) {

		return laptopBatteryDao.saveLaptop(laptop);
	}

	@GetMapping(value = "/getLaptop/{laptopId}")
	public Battery getLaptopBatteryById(@PathVariable int laptopId) {

		return laptopBatteryDao.getLaptopBatteryById(laptopId).getBattery();
	}

	@DeleteMapping(value = "/deleteById/{laptopId}")
	public void deleteLaptopBattery(@PathVariable int laptopId) {
		laptopBatteryDao.deleteLaptopBattery(laptopId);
	}

	/*
	 * display
	 */
	@GetMapping("/display")
	public List<Object> displayAllLatop() {
		return laptopBatteryDao.getAllLatopBattery();

	}

	/*
	 * update laptopBattery
	 */
	@PutMapping("/updateLaptopBattery")
	public Laptop updateLaptopBattery(Laptop laptop) {

		return laptopBatteryDao.updateLaptopBattery(laptop);
	}

}
