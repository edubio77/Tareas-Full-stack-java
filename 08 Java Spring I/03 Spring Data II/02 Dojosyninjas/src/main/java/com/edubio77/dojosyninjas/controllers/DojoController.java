package com.edubio77.dojosyninjas.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubio77.dojosyninjas.models.Dojo;
import com.edubio77.dojosyninjas.services.DojoService;

@Controller
public class DojoController {
	private final DojoService dojoService;
	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	//pagina de inicio
	@RequestMapping("/")
    public String home() {
        return "/basedatos/home.jsp";
    }
	
	//crear un dojo
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojoReal") Dojo dojo) {
		return "/basedatos/dojos.jsp";
	}
	
	@RequestMapping(value = "/agregardojos", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("dojoReal") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "/basedatos/dojos.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String getDojo(@PathVariable("id") Long id, Model model) { 
		model.addAttribute("dojo", dojoService.findDojo(id));
		return "/basedatos/ninjasydojos.jsp";
	}
}