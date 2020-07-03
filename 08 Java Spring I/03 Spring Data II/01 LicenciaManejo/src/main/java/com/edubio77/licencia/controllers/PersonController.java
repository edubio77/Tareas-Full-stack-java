package com.edubio77.licencia.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubio77.licencia.models.Person;
import com.edubio77.licencia.services.LicenseService;
import com.edubio77.licencia.services.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;
	@SuppressWarnings("unused")
	private LicenseService licenseService;
	
	public PersonController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	//pagina de inicio
    @RequestMapping("/")
    public String home() {
        return "basedatos/home.jsp";
    }
    
    //crear una persona
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("personReal") Person person, Model model) {
		return "basedatos/nuevapersona.jsp";
	}
	
	@RequestMapping(value="/person/formulario", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("personReal") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "basedatos/nuevapersona.jsp";
		}
		else {
			personService.addPerson(person);
			return "redirect:/licenses/new";
		}
	}
	
	//datos de una persona
		@RequestMapping("/persons/{person_id}")
		public String getPerson(@PathVariable("person_id") Long id, Model model) { 
			model.addAttribute("person", personService.findPerson(id));
			return "basedatos/usuario.jsp";
		}
}
