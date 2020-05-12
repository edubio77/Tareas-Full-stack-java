package com.edubio77.lenguajes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edubio77.lenguajes.models.Lenguaje;
import com.edubio77.lenguajes.repositories.LenguajeRepository;

@Service
public class LenguajeService {
	//Agregando el book al repositorio como una dependencia
	private final LenguajeRepository lenguajeRepository;
	
	public LenguajeService(LenguajeRepository lenguajeRepository) {
		this.lenguajeRepository = lenguajeRepository;	
	}
	
	
	//Devolviendo todos los lenguajes.
    public List<Lenguaje> allLenguajes() {
        return lenguajeRepository.findAll();
    }
    
  //Creando un lenguaje.
    public Lenguaje addLenguaje(Lenguaje l) {
    	return lenguajeRepository.save(l);
    }
   
  //Obteniendo la información de un lenguaje
    public Lenguaje findLenguaje(Long id) {
        Optional<Lenguaje> optionalLenguaje = lenguajeRepository.findById(id);
        if(optionalLenguaje.isPresent()) {
            return optionalLenguaje.get();
        } else {
            return null;
        }
    }
    
    //Borrar un lenguaje
    public void deleteLenguaje(Long id) {
    	lenguajeRepository.deleteById(id);
    }
}
