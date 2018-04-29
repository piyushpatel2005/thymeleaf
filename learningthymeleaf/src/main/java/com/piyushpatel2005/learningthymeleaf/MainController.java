package com.piyushpatel2005.learningthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView homePage() {
		return new ModelAndView("homepage", "username", "Matt Green");
	}
}
