package com.edubio77.enrutamiento;

//Crear un controlador llamado "CodingController". Para las primeras 3 rutas, utilizar la anotación @RequestMapping.
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/coding")
public class CodingController {
	//Haga que una solicitud GET a "http://localhost:8080/coding" muestre un texto que diga "¡Hola Coding Dojo!".
	@RequestMapping("")
    public String hello(){
      return "¡Hola Coding Dojo!";
    }
	
	//Haga que una solicitud GET a "http://localhost:8080/coding/python" muestre un texto que diga "¡Python/Django fue increíble!".
	@RequestMapping("/python")
    public String hello2(){
      return "Django fue increíble!";
    }
	
	//Haga que una solicitud GET a "http://localhost:8080/coding/java" muestre un texto que diga "¡Java/Spring es mejor!".
	@RequestMapping("/java")
    public String hello3(){
      return "Spring es mejor!";
    }
		
}
