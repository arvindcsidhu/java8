package com.example.demo;

import org.springframework.stereotype.Component;

@Component("laptopsidhu")
public class Laptop {
	
	private int laptopId;
	
	private String laptopCompany;



	public Laptop() {
		super();
		System.out.println("laptop object created");
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopCompany() {
		return laptopCompany;
	}

	public void setLaptopCompany(String laptopCompany) {
		this.laptopCompany = laptopCompany;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopCompany=" + laptopCompany + "]";
	}
	
	public void working() {
		System.out.println("working");
	}

}
