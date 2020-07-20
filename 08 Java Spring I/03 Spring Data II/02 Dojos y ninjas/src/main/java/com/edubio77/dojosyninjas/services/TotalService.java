package com.edubio77.dojosyninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edubio77.dojosyninjas.models.Dojo;
import com.edubio77.dojosyninjas.models.Ninja;
import com.edubio77.dojosyninjas.repositories.DojoRepository;
import com.edubio77.dojosyninjas.repositories.NinjaRepository;

@Service
public class TotalService {
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	
	public TotalService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}
	
	//crear un dojo
	public void create(Dojo entity) {
		dojoRepository.save(entity);
	}
	
	//crear un ninja
	public void create(Ninja entity) {
		ninjaRepository.save(entity);
	}
	
	//mostrar todos los dojos
	public List<Dojo> showAllDojos() {
		return dojoRepository.findAll();
	}
	
	//encontrar un dojo específico
	public Dojo findOneDojo(Long id) {
		Optional<Dojo> dojo = dojoRepository.findById(id);
		return dojo.get();
	}
}
