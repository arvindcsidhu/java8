package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PersonRestController {
	
	@Autowired
	 PersonRepository repo;
	
	@RequestMapping("/person")
	public String home() {
		return "person";
	}
	
	@PostMapping(path="/addPerson",consumes = {"application/json"})
	public Person addPerson(@RequestBody Person person) {
		repo.save(person);
		return person;
	}
	
	@GetMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam(name="id") Integer personId) {
		ModelAndView mv = new ModelAndView();
		Person p = repo.findById(personId).orElse(new Person());
		System.out.println(repo.findByPersonName("sidhu"));
		System.out.println(repo.findByIdGreaterThan(personId));
		mv.addObject(p);
		return mv;
	}
	
	@GetMapping("/getAllPerson")
	@ResponseBody
	public List<Person> getAllPerson() {
		return repo.findAll();
	}
	
	@GetMapping("/getPersonById/{id}")
	@ResponseBody
	public Optional<Person> getAllPerson(@PathVariable("id") int id) {
		return repo.findById(id);
	}

}
