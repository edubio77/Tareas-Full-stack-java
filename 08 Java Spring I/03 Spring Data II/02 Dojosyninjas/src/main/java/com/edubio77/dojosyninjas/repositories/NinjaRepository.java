package com.edubio77.dojosyninjas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edubio77.dojosyninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{
//-------------------------------------------------------------------------------------------------
// Finds ALL the Ninjas from the database
//-------------------------------------------------------------------------------------------------
	List<Ninja> findAll();
//-------------------------------------------------------------------------------------------------
// Finds one Ninja by ID from the database
//-------------------------------------------------------------------------------------------------
	Optional<Ninja> findById(Long id);
}