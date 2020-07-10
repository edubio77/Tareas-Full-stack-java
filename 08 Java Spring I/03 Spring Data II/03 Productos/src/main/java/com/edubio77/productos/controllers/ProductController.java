package com.edubio77.productos.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edubio77.productos.models.Product;
import com.edubio77.productos.services.ProductCategoryService;

@Controller
public class ProductController {
	private final ProductCategoryService productCategoryService;
	
	public ProductController(ProductCategoryService productCategoryService) {
		this.productCategoryService = productCategoryService;
	}
	
	@GetMapping("/products/new")
	public String newProdPage(@ModelAttribute("productReal") Product product) {
		return "basedatos/nuevoproducto.jsp";
	}
	
	@PostMapping("/agregarproducto")
	public String addProduct(@Valid @ModelAttribute("productReal") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "basedatos/nuevoproducto.jsp";
		}
		else {
			productCategoryService.addProd(product);
			return "redirect:/products/new";
		}
	}
}
