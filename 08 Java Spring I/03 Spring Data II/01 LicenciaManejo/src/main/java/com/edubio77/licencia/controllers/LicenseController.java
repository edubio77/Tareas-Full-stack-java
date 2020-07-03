package com.edubio77.licencia.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubio77.licencia.models.License;
import com.edubio77.licencia.models.Person;
import com.edubio77.licencia.services.LicenseService;
import com.edubio77.licencia.services.PersonService;

@Controller
public class LicenseController {
	private final LicenseService licenseService;
	@Autowired
	private final PersonService personService;
	
	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	//crear una licencia
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("licenseReal") License license, Model model) {
		//agrega variables nombres a la licencias
		List<Person> listapersonas = personService.allPersons();
		model.addAttribute("listapersonas", listapersonas);
		return "basedatos/nuevalicencia.jsp";
	}
	
	@RequestMapping(value="/license/formulario", method=RequestMethod.POST)
	public String addLicense(@Valid @ModelAttribute("licenseReal") License license, BindingResult result) {
		if (result.hasErrors()) {
			return "basedatos/nuevalicencia.jsp";
		}
		else {
			String numero = licenseService.crearNumeroLicencia();
			license.setNumber(numero);
			licenseService.addLicense(license);
			return "redirect:/persons/"+license.getId();
		}
	}
}
