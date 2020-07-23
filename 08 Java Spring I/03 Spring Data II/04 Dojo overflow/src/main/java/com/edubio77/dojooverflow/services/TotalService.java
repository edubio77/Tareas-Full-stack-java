package com.edubio77.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edubio77.dojooverflow.models.Answer;
import com.edubio77.dojooverflow.models.Question;
import com.edubio77.dojooverflow.models.Tag;
import com.edubio77.dojooverflow.repositories.AnswerRepository;
import com.edubio77.dojooverflow.repositories.QuestionRepository;
import com.edubio77.dojooverflow.repositories.TagRepository;

@Service
public class TotalService {
	private final QuestionRepository repositoryQ;
	private final AnswerRepository repositoryA;
	private final TagRepository repositoryT;
	
	public TotalService(
			AnswerRepository repositoryA, 
			QuestionRepository repositoryQ, 
			TagRepository repositoryT) {
		this.repositoryA = repositoryA;
		this.repositoryQ = repositoryQ;
		this.repositoryT = repositoryT;
	}
	//crear pregunta
	public void create(Question entity) {
		repositoryQ.save(entity);
	}
	//crear respuesta
	public void create(Answer entity) {
		repositoryA.save(entity);
	}
	public void create(Tag entity) {
		repositoryT.save(entity);
	}
	
	//Mostrar preguntas y respuestas - /questions
	public List<Question> showQuestions(){
		return repositoryQ.findAll();
	}
	public List<Answer> showAnswers(){
		return repositoryA.findAll();
	}
	
	//Mostrar preguntas por Id - /question/{id}
	public Question findoneQuestion(Long id) {
		Optional<Question> o = repositoryQ.findById(id);
		if(o.isPresent()) return o.get();
		else return null;
	}
}