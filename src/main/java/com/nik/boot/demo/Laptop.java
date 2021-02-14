package com.nik.boot.demo;

import org.springframework.stereotype.Component;

@Component("laptop1")
public class Laptop {

	private int lid;
	private String brand;

	public int getLid() {
		System.out.println("inside laptop getlid");
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
