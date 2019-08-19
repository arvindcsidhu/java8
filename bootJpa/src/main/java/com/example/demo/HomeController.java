package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	 PersonRepository repo;
	
	@RequestMapping("person")
	public String home() {
		return "person";
	}
	
	@RequestMapping("addPerson")
	public String addPerson(Person person) {
		repo.save(person);
		return "person";
	}

}
