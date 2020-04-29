package com.edubio77.enrutamiento;

//Crear otro controlador llamado "DojoController". Para las rutas a continuación, utilice la anotación @PathVariable.
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DojoController {
	@RequestMapping("{ruta}")
	public String dojo(@PathVariable("ruta") String ruta) {
		if(ruta.equals("dojo")) {
			return "¡El Dojo es increíble!";
		}
		if(ruta.equals("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		}
		if(ruta.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}
		else{
			return null;			
		}
	}	
}
