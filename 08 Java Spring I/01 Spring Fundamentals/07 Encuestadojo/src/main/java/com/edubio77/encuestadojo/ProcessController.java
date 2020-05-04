package com.edubio77.encuestadojo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProcessController {
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String input(@RequestParam(value="nombre") String nombre, @RequestParam(value="ubicacion") String ubicacion,
			@RequestParam(value="lenguajes") String lenguajes, @RequestParam(value="comentario") String comentario, HttpSession session) {
		session.setAttribute("nombre", nombre);
		session.setAttribute("ubicacion", ubicacion);
		session.setAttribute("lenguajes", lenguajes);
		session.setAttribute("comentario", comentario);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
    public String result(HttpSession session, Model model) {
        model.addAttribute("nombre", session.getAttribute("nombre"));
        model.addAttribute("ubicacion", session.getAttribute("ubicacion"));
        model.addAttribute("lenguajes", session.getAttribute("lenguajes"));
        model.addAttribute("comentario", session.getAttribute("comentario"));
        return "result.jsp";
    }
}
