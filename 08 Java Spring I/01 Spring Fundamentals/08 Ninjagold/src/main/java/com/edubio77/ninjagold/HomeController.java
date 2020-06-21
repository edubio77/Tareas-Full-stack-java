package com.edubio77.ninjagold;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class HomeController {
	
	@RequestMapping("/gold")
	public String gold(HttpSession session) {
		if (session.getAttribute("total") == null) {
			session.setAttribute("total", 0);
			ArrayList<String> actividades = new ArrayList<String>();
			session.setAttribute("actividades", actividades);
		}
		return "gold.jsp";
	}
	String fecha = new SimpleDateFormat("MMM dd yyyy hh:mm aaa").format(new Date());
	//Farm
	@RequestMapping(value="/farm", method=RequestMethod.POST)
    public String farmgold(Model model, HttpSession session, RedirectAttributes redirectAttributes) {
		//contador oro
		Integer total = (Integer) session.getAttribute("total");
		int oro = ThreadLocalRandom.current().nextInt(10, 20);
		session.setAttribute("total", total+oro);
		
		//actividades
		ArrayList<String> array = (ArrayList<String>) session.getAttribute("actividades");
		String actividad = "Tu ganaste " + oro + " oros en la granja "+fecha;
		array.add(0, actividad);
		session.setAttribute("actividades", array);
		return "redirect:/gold";
    }
	
	//Cave
	@RequestMapping(value="/cave", method=RequestMethod.POST)
    public String cavegold(Model model, HttpSession session, RedirectAttributes redirectAttributes) {
		//contador oro
		Integer total = (Integer) session.getAttribute("total");
		int oro = ThreadLocalRandom.current().nextInt(5, 10);
		session.setAttribute("total", total+oro);			
		
		//actividades
		ArrayList<String> array = (ArrayList<String>) session.getAttribute("actividades");
		String actividad = "Tu ganaste " + oro + " oros en la cueva "+fecha;
		array.add(0, actividad);
		session.setAttribute("actividades", array);
		return "redirect:/gold";
    }
	
	//House
	@RequestMapping(value="/house", method=RequestMethod.POST)
    public String housegold(Model model, HttpSession session, RedirectAttributes redirectAttributes) {
		//contador oro
		Integer total = (Integer) session.getAttribute("total");
		int oro = ThreadLocalRandom.current().nextInt(2, 5);
		session.setAttribute("total", total+oro);
		
		//actividades
		ArrayList<String> array = (ArrayList<String>) session.getAttribute("actividades");
		String actividad = "Tu ganaste " + oro + " oros en la casa "+fecha;
		array.add(0, actividad);
		session.setAttribute("actividades", array);
		return "redirect:/gold";
    }
	
	//Casino
	@RequestMapping(value="/casino", method=RequestMethod.POST)
    public String casinogold(Model model, HttpSession session, RedirectAttributes redirectAttributes) {
		//contador oro
		Integer total = (Integer) session.getAttribute("total");				
		int oro = ThreadLocalRandom.current().nextInt(-50, 50);
		session.setAttribute("total", total+oro);
		
		//actividades
		ArrayList<String> array = (ArrayList<String>) session.getAttribute("actividades");
		if(oro > 0) {
			String actividad = "Tu ganaste " + oro + " oros en el casino "+fecha;
			array.add(0, actividad);
		}
		else {
			String actividad = "Tu perdiste " + oro + " oros en el casino "+fecha;
			array.add(0, actividad);
		}
		session.setAttribute("actividades", array);
		return "redirect:/gold";
    }
	
	

}

