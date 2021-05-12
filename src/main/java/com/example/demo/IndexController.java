package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@GetMapping("/")
	public ModelAndView paginaIndice() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("student", new Student());
		return mv;
		
	}
	@PostMapping(path = "/addStudentForm")
	public ModelAndView pintarstudiante(@ModelAttribute Student estudiante) {
		ModelAndView mv = new ModelAndView("fin");
		System.out.println(estudiante);
		mv.addObject("estudiante", estudiante);
		return mv;
	} 
}
