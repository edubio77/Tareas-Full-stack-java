package com.edubio77.dojosyninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edubio77.dojosyninjas.models.Dojo;
import com.edubio77.dojosyninjas.models.Ninja;
import com.edubio77.dojosyninjas.services.TotalService;

@Controller
public class TotalController {
	private final TotalService totalService;
	public TotalController(TotalService totalService) {
		this.totalService = totalService;
		}
	
	//CONTROLLER DOJO

	//pagina de inicio
		@RequestMapping("/")
	    public String home() {
	        return "/basedatos/home.jsp";
	    }
	
	//mostrar dojo por id
	@RequestMapping("dojos/{id}")
	public String Index(@PathVariable("id") Long id, Model model) {
		Dojo dojo = totalService.findOneDojo(id);
		model.addAttribute("dojos",dojo);
		return "/basedatos/ninjasydojos.jsp";
	}
	
	//crear un nuevo dojo
	@RequestMapping("/dojos/new")
	public String IndexDojo(Model model, @ModelAttribute("dojo") Dojo dojo) {
		model.addAttribute(dojo);
		return "/basedatos/dojos.jsp";
	}
	
	//
	@RequestMapping(value="/dojos/addDojo",method=RequestMethod.POST)
	public String FormDojo(@Valid @ModelAttribute("dojo") Dojo dojo) {
		totalService.create(dojo);
		return "redirect:/dojos/new";
	}
	
	//CONTROLLER NINJA
	
	//crear ninja
	@RequestMapping("/ninjas/new")
	public String IndexNinja(Model model) {
		List<Dojo> dojo = totalService.showAllDojos();
		model.addAttribute("dojos",dojo);
		return "/basedatos/ninjas.jsp";
	}
	
	//juntar datos con el dojo correspondiente
	@RequestMapping(value="/ninjas/addNinja", method=RequestMethod.POST)
	public String FormNinja(@Valid 
			@RequestParam("dojoId") Long dojoId,
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("age") int age) {
		Dojo dojo = totalService.findOneDojo(dojoId);
		Ninja ninja = new Ninja(firstName, lastName, age, dojo);
		totalService.create(ninja);
		return "redirect:/ninjas/new";
	}
	
}
