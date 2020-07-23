package com.edubio77.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edubio77.dojooverflow.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer,Long>{
	List<Answer> findAll();
}