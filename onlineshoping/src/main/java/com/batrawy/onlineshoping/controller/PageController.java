package com.batrawy.onlineshoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","home","index","page"} )
	
	public ModelAndView index(){
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting","welcome to spring mvc");
		return mv;
	}
	
	
}
