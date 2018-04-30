package com.piyushpatel2005.learningthymeleaf;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView homePage() {
		Map<String, Object> model = new HashMap<>();
		model.put("username", "Matt Patel");
		model.put("id", 173);
		return new ModelAndView("homepage", "model", model);
	}
	
	@RequestMapping("/profile")
	public ModelAndView viewProfile() {
		Map<String, Object> model = new HashMap<>();
		model.put("title", "Mr.");
		model.put("firstName", "Matt");
		model.put("lastName", "patel");
		model.put("dateOfBirth", new GregorianCalendar(2006, 3, 9).getTime());
		model.put("description", "a <strong>fantastic</strong> Java Programmer");
		
		List<String> languages = new ArrayList<>();
		languages.add("English");
		languages.add("French");
		languages.add("Spanish");
		languages.add("Danish");
		
		model.put("languages", languages);
		return new ModelAndView("profile", "model", model);
	}
}
