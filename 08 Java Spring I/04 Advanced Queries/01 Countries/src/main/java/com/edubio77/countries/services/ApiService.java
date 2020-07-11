package com.edubio77.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edubio77.countries.repositories.CityRepository;
import com.edubio77.countries.repositories.CountryRepository;
import com.edubio77.countries.repositories.LanguageRepository;

@Service 
public class ApiService {
    private CountryRepository countryRepository;
    private CityRepository cityRepository;
    private LanguageRepository languageRepository;
    
    public ApiService(CountryRepository countryRepository, CityRepository cityRepository, LanguageRepository langRepository) {
        this.countryRepository = countryRepository;
        this.cityRepository = cityRepository;
    }

    //pregunta 1
    public List<Object[]> p1() {
        List<Object[]> table = countryRepository.p1();
        return table;
    }
    //pregunta 2
    public List<Object[]> p2() {
        List<Object[]> table = countryRepository.p2();
        return table;
    }
    //pregunta 3
    public List<Object[]> p3() {
        List<Object[]> table = cityRepository.p3();
        return table;
    }
    //pregunta 4
    public List<Object[]> p4() {
        List<Object[]> table = languageRepository.p4();
        return table;
    }
    //pregunta 5
    public List<Object[]> p5() {
        List<Object[]> table = countryRepository.p5();
        return table;
    }
    //pregunta 6
    public List<Object[]> p6() {
        List<Object[]> table = countryRepository.p6();
        return table;
    }
    //pregunta 7
    public List<Object[]> p7() {
        List<Object[]> table = cityRepository.p7();
        return table;
    }
    //pregunta 8
    public List<Object[]> p8() {
        List<Object[]> table = countryRepository.p8();
        return table;
    }
}
