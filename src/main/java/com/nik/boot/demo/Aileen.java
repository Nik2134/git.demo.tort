package com.nik.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Aileen {

	public Aileen() {
		System.out.println("object created");
		
	}

	private int id;
	private String name;
	private String tech;
	@Autowired
	@Qualifier("laptop1")
	private Laptop lap; 

	public int getId() {
		lap.getLid();
		System.out.println("get id");
		return id;
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	/**
	 * @return the lap
	 */
	public Laptop getLap() {
		return lap;
	}

	/**
	 * @param lap the lap to set
	 */
	public void setLap(Laptop lap) {
		this.lap = lap;
	}

}
