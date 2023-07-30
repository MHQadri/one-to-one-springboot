package com.jsp.onetoonespringboot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.onetoonespringboot.dto.Battery;
import com.jsp.onetoonespringboot.dto.Laptop;
import com.jsp.onetoonespringboot.repository.BatteryRepository;
import com.jsp.onetoonespringboot.repository.LaptopRepository;

@Repository
public class LaptopBatteryDao {

	@Autowired
	private LaptopRepository laptopRepository;

	@Autowired
	private BatteryRepository batteryRepository;

	/*
	 * save LaptopBattery
	 */
	public Laptop saveLaptop(Laptop laptop) {

		return laptopRepository.save(laptop);

	}

	/*
	 * getLaptopBattery ById
	 */
	public Laptop getLaptopBatteryById(int laptopId) {

		Optional<Laptop> optional = laptopRepository.findById(laptopId);

		if (optional.isPresent()) {
			return optional.get();
		}
		return null;

	}

	/*
	 * Delete
	 */
	public void deleteLaptopBattery(int laptopId) {

		Laptop laptop = getLaptopBatteryById(laptopId);
		laptopRepository.delete(laptop);
	}

	/*
	 * Display
	 */
	public List<Object> getAllLatopBattery() {

		List<Battery> batteries = batteryRepository.findAll();
		List<Laptop> laptops = laptopRepository.findAll();
		List<Object> obj = new ArrayList<Object>();

		obj.add(batteries);
		obj.add(laptops);

		return obj;
	}

	/*
	 * update Laptop battery
	 */
	public Laptop updateLaptopBattery(Laptop laptop) {

		Optional<Laptop> lap = laptopRepository.findById(laptop.getLaptopId());

		if (lap.isPresent()) {
			Laptop l = lap.get();

			Battery battery = l.getBattery();

			l.setLaptopId(laptop.getLaptopId());
			l.setLaptopName(laptop.getLaptopName());
			l.setLaptopPrice(laptop.getLaptopPrice());
			l.setBattery(laptop.getBattery());

			laptopRepository.save(l);

			return l;

		}
		return null;
	}
}
