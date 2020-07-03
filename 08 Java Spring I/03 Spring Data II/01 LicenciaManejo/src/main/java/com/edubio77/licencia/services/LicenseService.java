package com.edubio77.licencia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edubio77.licencia.models.License;
import com.edubio77.licencia.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	//crear una nueva licencia
	public License addLicense(License addlicense) {
		return licenseRepository.save(addlicense);
	}
	
	//devolviendo todas las licencias
	public List<License> allLicense() {
		return licenseRepository.findAll();
	}
		
	//Obteniendo la información de una licencia
    public License findLicense(Long id) {
        Optional<License> optionalLicense = licenseRepository.findById(id);
        if(optionalLicense.isPresent()) {
            return optionalLicense.get();
        } else 
        	{
            return null;
        }
    }
    
    public static int numeroLicencia;
    
    public static int getNumeroLicencia() {
		return numeroLicencia;
	}

	public static void setNumeroLicencia(int numeroLicencia) {
		LicenseService.numeroLicencia = numeroLicencia;
	}
    
	public String crearNumeroLicencia() {
		if (licenseRepository.findTopByOrderByNumberDesc().isEmpty()) {
			numeroLicencia = numeroLicencia+1;
			return Integer.toString(numeroLicencia);
		}
		List<License> top = licenseRepository.findTopByOrderByNumberDesc();
		numeroLicencia = 1 + (Integer.parseInt(top.get(0).getNumber()));
		return Integer.toString(numeroLicencia);
	}
}
