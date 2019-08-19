package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Person;


public interface PersonRepository extends CrudRepository<Person, Integer>{

}
