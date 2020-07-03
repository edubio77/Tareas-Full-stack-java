package com.edubio77.licencia.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edubio77.licencia.models.License;

@Repository
public interface LicenseRepository extends CrudRepository <License, Long>{
	List<License> findAll();
	List<License> findTopByOrderByNumberDesc();
}
