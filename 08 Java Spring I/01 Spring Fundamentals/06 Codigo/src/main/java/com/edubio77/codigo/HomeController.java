package com.edubio77.codigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String success(@RequestParam(value="code") String code, RedirectAttributes errormsg) {
		if(code.equals("Bushido")) {
			return "code.jsp";			
		}
		else {
	        errormsg.addFlashAttribute("error", "Vuelve a intentarlo");
	        return "redirect:/";
		}
	}
}
