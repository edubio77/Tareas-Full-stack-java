package com.edubio77.fecha;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
   
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/fecha")
	public String fecha(Model model) {
		Date fecha = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE, d MMM, yyyy");
		String formattedDate = formatter.format(fecha);
		model.addAttribute("fecha", formattedDate);
		return "/fecha.jsp";
	}
	
	@RequestMapping("/hora")
	public String hora(Model model) {
		Date hora = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm a" );
		String formattedTime = formatter.format(hora);
		model.addAttribute("hora", formattedTime);
		return "/hora.jsp";
	}
}