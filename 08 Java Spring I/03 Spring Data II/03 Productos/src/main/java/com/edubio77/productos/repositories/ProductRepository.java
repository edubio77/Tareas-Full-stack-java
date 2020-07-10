package com.edubio77.productos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edubio77.productos.models.Product;

@Repository
public interface ProductRepository extends CrudRepository <Product, Long> {
	List<Product> findAll();
}
