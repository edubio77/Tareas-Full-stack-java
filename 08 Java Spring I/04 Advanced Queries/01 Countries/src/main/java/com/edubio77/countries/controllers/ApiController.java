package com.edubio77.countries.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edubio77.countries.services.ApiService;

@Controller
public class ApiController {
    private ApiService apiService;
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    //pagina de inicio
    @RequestMapping("/")
    public String index() {
        return "home.jsp";
    }
    
    //pregunta 1
    @RequestMapping("/p1")
    public String p1(Model model) {
        ArrayList<String> columns = new ArrayList<String>();
        columns.add("País");
        columns.add("Lenguaje");
        columns.add("Porcentage");
        model.addAttribute("columns", columns);
    	model.addAttribute("query", "Pregunta 1");
    	model.addAttribute("pregunta", "¿Qué consulta ejecutarías para obtener todos los países que hablan Sloveno? ");
        model.addAttribute("table", apiService.p1());
        return "query.jsp";
    }
    //pregunta 2
    @RequestMapping("/p2")
    public String p2(Model model) {
        ArrayList<String> columns = new ArrayList<String>();
        columns.add("País");
        columns.add("Número de ciudades");
        model.addAttribute("columns", columns);
        model.addAttribute("query", "Pregunta 2");
        model.addAttribute("pregunta", "¿Qué consulta ejecutarías para mostrar el número total de ciudades de cada país?");
        model.addAttribute("table", apiService.p2());
        return "query.jsp";
    }
    //pregunta 3
    @RequestMapping("/p3")
    public String p3(Model model) {
        ArrayList<String> columns = new ArrayList<String>();
        columns.add("Ciudad");
        columns.add("Población");
        model.addAttribute("columns", columns);
        model.addAttribute("query", "Pregunta 3");
        model.addAttribute("pregunta", "¿Qué consulta ejecutarías para obtener todas las ciudades en México con una población mayor a 500.000? ");
        model.addAttribute("table", apiService.p3());
        return "query.jsp";
    }
    //pregunta 4
    @RequestMapping("/p4")
    public String p4(Model model) {
        ArrayList<String> columns = new ArrayList<String>();
        columns.add("País");
        columns.add("Lenguaje");
        columns.add("Porcentaje");
        model.addAttribute("columns", columns);
        model.addAttribute("query", "Pregunta 4");
        model.addAttribute("pregunta", "¿Qué consulta ejecutarías para obtener todos los lenguajes en cada país con un porcentaje mayor al 89%?");
        model.addAttribute("table", apiService.p4());
        return "query.jsp";
    }
    //pregunta 5
    @RequestMapping("/p5")
    public String p5(Model model) {
        ArrayList<String> columns = new ArrayList<String>();
        columns.add("País");
        columns.add("Superficie");
        columns.add("Población");
        model.addAttribute("columns", columns);
        model.addAttribute("query", "Pregunta 5");
        model.addAttribute("pregunta", "¿Qué consulta ejecutarías para obtener todos los países con un superficie de área inferior a 501 y una población mayor a 100.000?");
        model.addAttribute("table", apiService.p5());
        return "query.jsp";
    }
    //pregunta 6
    @RequestMapping("/p6")
    public String p6(Model model) {
        ArrayList<String> columns = new ArrayList<String>();
        columns.add("Monarquía");
        model.addAttribute("columns", columns);
        model.addAttribute("query", "Pregunta 6");
        model.addAttribute("pregunta", "¿Qué consulta ejecutarías para obtener todos los países que tienen solo Constitutional Monarchy (Monarquía) y una superficie de área mayor a 200 y una expectativa de vida superior a los 75 años?");
        model.addAttribute("table", apiService.p6());
        return "query.jsp";
    }
    //pregunta 7
    @RequestMapping("/p7")
    public String p7(Model model) {
        ArrayList<String> columns = new ArrayList<String>();
        columns.add("País");
        columns.add("Ciudad");
        columns.add("Distrito");
        columns.add("Población");
        model.addAttribute("columns", columns);
        model.addAttribute("query", "Pregunta 7");
        model.addAttribute("pregunta", "¿Qué consulta ejecutarías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires y que tengan una población mayor a 500.000?");
        model.addAttribute("table", apiService.p7());
        return "query.jsp";
    }
    //pregunta 8
    @RequestMapping("/p8")
    public String p8(Model model) {
        ArrayList<String> columns = new ArrayList<String>();
        columns.add("Regiones");
        columns.add("Número de países");
        model.addAttribute("columns", columns);
        model.addAttribute("query", "Pregunta 8");
        model.addAttribute("pregunta", "¿Qué consulta ejecutarías para sumar el número de países en cada región? ");
        model.addAttribute("table", apiService.p8());
        return "query.jsp";
    }
    
}
