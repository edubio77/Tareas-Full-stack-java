package com.edubio77.productos.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edubio77.productos.models.Category;
import com.edubio77.productos.models.CategoryProduct;
import com.edubio77.productos.models.Product;
import com.edubio77.productos.repositories.CategoryProductRepository;
import com.edubio77.productos.repositories.CategoryRepository;
import com.edubio77.productos.repositories.ProductRepository;

@Service
public class ProductCategoryService {
	private final ProductRepository productRepository;
	private final CategoryRepository categoryRepository;
	private final CategoryProductRepository categoryProductRepository;
	
	public ProductCategoryService(ProductRepository productRepository, CategoryRepository categoryRepository, CategoryProductRepository categoryProductRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
		this.categoryProductRepository = categoryProductRepository;
	}
	
	//Productos
	//crear un nuevo producto
	public void addProd(Product product) {
		productRepository.save(product);
	}
	
	public Product singleProd(Long id) {
		Optional<Product> product = productRepository.findById(id);
		if(product.isPresent()) {
			return product.get();
		}
		else {
			return null;
		}
	}
	
	//Categorías
	//crear una nueva categoría
	public void addCat(Category category) {
		categoryRepository.save(category);
	}
}
