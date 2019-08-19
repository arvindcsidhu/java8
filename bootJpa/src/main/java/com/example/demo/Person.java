package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private int id;
	private String personName;
	
	public Person(int id, String personName) {
		super();
		this.id = id;
		this.personName = personName;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPersonName() {
		return personName;
	}



	public void setPersonName(String personName) {
		this.personName = personName;
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + "]";
	}
	
	public Person() {
		
	}

}
