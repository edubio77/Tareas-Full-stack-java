package com.edubio77.dojosyninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubio77.dojosyninjas.models.Dojo;
import com.edubio77.dojosyninjas.models.Ninja;
import com.edubio77.dojosyninjas.services.DojoService;
import com.edubio77.dojosyninjas.services.NinjaService;

@Controller
public class NinjaController {
	private final NinjaService ninjaService;
	private final DojoService dojoService;
	
	public NinjaController(NinjaService ninjaService, DojoService dojoService) {		
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}


	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninjaReal") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "/basedatos/ninjas.jsp";
	}

	@RequestMapping(value = "agregarninjas", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("ninjaReal") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "/basedatos/ninjas.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas";
		}
	}

}
