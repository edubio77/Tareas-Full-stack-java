package com.edubio77.licencia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edubio77.licencia.models.Person;
import com.edubio77.licencia.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	//devolviendo todas las personas
	public List<Person> allPersons() {
		return personRepository.findAll();
	}
	
	//creando una nueva persona
	public Person addPerson(Person p) {
		return personRepository.save(p);
	}
	
	//Obteniendo la información de una persona
	public Person findPerson(Long id) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if(optionalPerson.isPresent()) {
            return optionalPerson.get();
        } else 
        	{
            return null;
        }
    }
}
