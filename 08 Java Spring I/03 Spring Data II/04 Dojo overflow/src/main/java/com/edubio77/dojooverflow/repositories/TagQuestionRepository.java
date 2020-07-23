package com.edubio77.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edubio77.dojooverflow.models.TagQuestion;

@Repository
public interface TagQuestionRepository extends CrudRepository<TagQuestion,Long>{

}