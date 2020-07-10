package com.edubio77.productos.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edubio77.productos.models.Category;
import com.edubio77.productos.services.ProductCategoryService;

@Controller
public class CategoryController {
	private final ProductCategoryService productCategoryService;
	
	public CategoryController(ProductCategoryService productCategoryService) {
		this.productCategoryService = productCategoryService;
	}
	
	//pagina de inicio
    @RequestMapping("/")
    public String home() {
        return "basedatos/home.jsp";
    }
	
	@GetMapping("/categories/new")
	public String newCatPage(@ModelAttribute("categoryReal") Category category) {
		return "basedatos/nuevacategoria.jsp";
	}
	
	@PostMapping("/agregarcategoria")
	public String addCategory(@Valid @ModelAttribute("categoryReal") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "/categories/new";
		}
		else {
			productCategoryService.addCat(category);
			return "redirect:/categories/new";
		}
	}
}
