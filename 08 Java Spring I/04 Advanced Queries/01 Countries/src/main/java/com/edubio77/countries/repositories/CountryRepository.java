package com.edubio77.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.edubio77.countries.models.Country;

public interface CountryRepository extends CrudRepository<Country, Long>{

    // 1. ¿Qué consulta ejecutarías para obtener todos los países que hablan Sloveno?
    @Query(value="SELECT countries.name, languages.language, languages.percentage FROM countries JOIN languages ON countries.id = languages.country_id WHERE language = 'Slovene'", nativeQuery=true)
    List<Object[]> p1();

    // 2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades de cada país? 
    @Query(value="SELECT countries.name, COUNT(cities.id) AS num_cities FROM countries JOIN cities ON countries.id = cities.country_id GROUP BY countries.id ORDER BY num_cities DESC;", nativeQuery=true)
    List<Object[]> p2();

    // 5. ¿Qué consulta ejecutarías para obtener todos los países con un superficie de área inferior a 501 y una población mayor a 100.000?
    @Query(value="SELECT name, surface_area, population FROM countries WHERE countries.surface_area<501 AND countries.population>100000;", nativeQuery=true)
    List<Object[]> p5();

    // 6. ¿Qué consulta ejecutarías para obtener todos los países que tienen solo Constitutional Monarchy (Monarquía) y una superficie de área mayor a 200 y una expectativa de vida superior a los 75 años?
    @Query(value="SELECT name FROM countries WHERE government_form = 'Constitutional Monarchy' AND surface_area > 200 AND life_expectancy > 75;", nativeQuery=true)
    List<Object[]> p6();
    
    // 8. ¿Qué consulta ejecutarías para sumar el número de países en cada región? 
    @Query(value="SELECT countries.region, COUNT(countries.id) AS num_countries FROM countries GROUP BY countries.region ORDER BY num_countries DESC;", nativeQuery=true)
    List<Object[]> p8();
}
