package com.edubio77.holahumano;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
	public class HomeController {
	    @RequestMapping("/")
	    public String index(@RequestParam(value="nombre", required=false) String searchQuery, Model model) {
	    	if(searchQuery==null) {
	    		model.addAttribute("nombre", searchQuery);
	    		return "/index.jsp";
	    	}
	    	else {
	    		model.addAttribute("nombre", searchQuery);
	    		return "/index.jsp";	
	    	}
	        
	    }
	   
	}

