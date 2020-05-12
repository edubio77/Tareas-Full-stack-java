package com.edubio77.lenguajes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edubio77.lenguajes.models.Lenguaje;

@Repository
public interface LenguajeRepository extends CrudRepository<Lenguaje, Long> {
	List<Lenguaje> findAll();

}

