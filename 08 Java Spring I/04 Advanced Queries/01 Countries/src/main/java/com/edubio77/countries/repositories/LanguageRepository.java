package com.edubio77.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.edubio77.countries.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {

    // 4. ¿Qué consulta ejecutarías para obtener todos los lenguajes en cada país con un porcentaje mayor al 89%? 
    @Query(value="SELECT countries.name, languages.language, languages.percentage FROM languages JOIN countries ON countries.id = languages.country_id WHERE languages.percentage > 89 ORDER BY languages.percentage DESC;", nativeQuery=true)
    List<Object[]> p4();
}