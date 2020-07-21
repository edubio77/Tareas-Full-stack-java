package com.edubio77.productos.services;

import java.util.List;
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
	
	//crear producto
	public void create(Product entity) {
		productRepository.save(entity);
	}
	//crear categoría
	public void create(Category entity) {
		categoryRepository.save(entity);
	}
	//crear producto-categoría
	public void create(CategoryProduct entity) {
		categoryProductRepository.save(entity);
	}
	//mostrar todos los productos
	public List<Product> showProducts(){
		return productRepository.findAll();
	}
	//mostrar todas las categorías
	public List<Category> showCategories(){
		return categoryRepository.findAll();
	}
	//encontrar productor por id
	public Product findOneProd(Long id) {
		Optional<Product> o = productRepository.findById(id);
		if(o.isPresent()) return o.get();
		else return null;
	}
	//encontrar categorías por id
	public Category findOneCate(Long id) {
		Optional<Category> o = categoryRepository.findById(id);
		if(o.isPresent()) return o.get();
		else return null;
	}
}

	


