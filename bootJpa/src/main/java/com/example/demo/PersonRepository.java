package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Person;


public interface PersonRepository extends JpaRepository<Person, Integer>{
	
	List<Person> findByPersonName(String name);
	
	List<Person> findByIdGreaterThan(int id);

}
