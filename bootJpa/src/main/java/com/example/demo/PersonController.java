package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {
	
	@Autowired
	 PersonRepository repo;
	
	@RequestMapping("/person")
	public String home() {
		return "person";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson(Person person) {
		repo.save(person);
		return "person";
	}
	
	@RequestMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam(name="id") Integer personId) {
		ModelAndView mv = new ModelAndView();
		Person p = repo.findById(personId).orElse(new Person());
		mv.addObject(p);
		return mv;
	}

}
