package com.edubio77.lenguajes.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubio77.lenguajes.models.Lenguaje;
import com.edubio77.lenguajes.services.LenguajeService;


@Controller
public class LenguajeController {
	//Agregando el lenguaje al service como una dependencia
	private final LenguajeService lenguajeService;
    
    public LenguajeController(LenguajeService lenguajeService) {
        this.lenguajeService = lenguajeService;
    }
    
    //La ruta GET /languages debe mostrar una tabla con todos los lenguajes y los botones de Editar y Eliminar 
    //para cada lenguaje, también debe incluir un formulario para crear un nuevo lenguaje,
    @RequestMapping("/lenguajes")
	public String index(@ModelAttribute("addNew") Lenguaje lenguaje, Model model) {
		List<Lenguaje> lenguajes = lenguajeService.allLenguajes();
		model.addAttribute("lenguajes", lenguajes);
		return "lenguajes/index.jsp";
	}

    //La ruta POST/languages debe crear un lenguaje.
	@RequestMapping(value="/lenguajes", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("addNew") Lenguaje lenguaje, BindingResult result, Model model) {
        if (result.hasErrors()) {
    		List<Lenguaje> lenguajes = lenguajeService.allLenguajes();
    		model.addAttribute("lenguajes", lenguajes);
            return "lenguajes/index.jsp";
        }
        else {
            lenguajeService.addLenguaje(lenguaje);
            return "redirect:/lenguajes";
        }
	}

	//La ruta PUT/languages/{id} debe actualizar un lenguaje.
	@RequestMapping(value="/lenguajes/{id}", method=RequestMethod.PUT)
	public String modify(@Valid @ModelAttribute("lenguaje") Lenguaje lenguaje, BindingResult result) {
        if (result.hasErrors()) {
            return "lenguajes/edit.jsp";
        }
        else {
            lenguajeService.addLenguaje(lenguaje);
            return "redirect:/lenguajes";
        }
	}
	
	//La ruta GET /languages/{id} debe retornar un lenguaje específico y sus detalles.
	@RequestMapping("/lenguajes/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Lenguaje lenguaje = lenguajeService.findLenguaje(id);
		model.addAttribute("lenguaje", lenguaje);
		return "lenguajes/show.jsp";
	}
	
	//La ruta GET /languages/{id}/edit debe mostrar la página para editar un lenguaje específico.
	@RequestMapping("/lenguajes/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Lenguaje lenguaje = lenguajeService.findLenguaje(id);
		model.addAttribute("lenguaje", lenguaje);
		return "lenguajes/edit.jsp";
	}
	
	//La ruta DELETE/languages/{id} debe eliminar el lenguaje con ese id.
	@RequestMapping("/lenguajes/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		lenguajeService.deleteLenguaje(id);
		return "redirect:/lenguajes";
	}
}
