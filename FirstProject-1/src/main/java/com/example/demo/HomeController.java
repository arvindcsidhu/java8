package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	/*
	 * @RequestMapping("home") public String home(HttpServletRequest req) {
	 * 
	 * String name = req.getParameter("name");
	 * System.out.println("in home controller:"+name); HttpSession session =
	 * req.getSession(); session.setAttribute("name", name); return "home"; }
	 */
	
	/*
	 * @RequestMapping("home") public String home(String name,HttpSession session) {
	 * 
	 * 
	 * System.out.println("in home controller:"+name); session.setAttribute("name",
	 * name); return "home"; }
	 */
	
	/*
	 * @RequestMapping("home") public ModelAndView home(@RequestParam("name")String
	 * myName) {
	 * 
	 * ModelAndView mv = new ModelAndView(); mv.addObject("name", myName);
	 * mv.setViewName("home"); return mv; }
	 */
	
	@RequestMapping("home")
	public ModelAndView home(Employee emp) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", emp);
		mv.setViewName("home");
		return mv;
	}

}
