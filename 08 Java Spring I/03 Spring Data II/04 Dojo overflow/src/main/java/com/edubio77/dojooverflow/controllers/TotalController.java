package com.edubio77.dojooverflow.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edubio77.dojooverflow.models.Answer;
import com.edubio77.dojooverflow.models.Question;
import com.edubio77.dojooverflow.models.Tag;
import com.edubio77.dojooverflow.services.TotalService;
import com.edubio77.dojosyninjas.models.Dojo;

@Controller
public class TotalController {
	private TotalService service;
	
	public TotalController(TotalService service) {
		this.service = service;
	}
	//mostrar preguntas /questions
	@RequestMapping("/questions")
	public String Dashboard(Model model) {
		//invoca al service - mostrar preguntas
		List<Question> question = service.showQuestions();
		model.addAttribute("questions",question);
		return "dashboard.jsp";
	}
	//mostrar preguntas por id
	@RequestMapping("/questions/{id}")
	public String ShowQuestion(@PathVariable("id") Long id, Model model) {
		Question question = service.findoneQuestion(id);
		model.addAttribute("question",question);
		return "showQuestion.jsp";
	}
	
	@RequestMapping("/questions/new")
	public String IndexQuestion() {
		return "newQuestion.jsp";
	}
	//ruta post - crea una pregunta
	@RequestMapping(value="/questions/addAnswerQuestion", method=RequestMethod.POST)
	public String FormAnswer(@Valid
			@RequestParam("answer") String answer,
			@RequestParam("questionId") Long questionId) {
		Answer a = new Answer(answer, service.findoneQuestion(questionId));
		service.create(a);
		return "redirect:/questions/"+questionId;
	}
	
	//ruta post - crear una etiqueta
	@RequestMapping(value="/questions/addquestiontag", method=RequestMethod.POST)
	public String FormQuestion(@Valid 
			@RequestParam("question") String question, 
			@RequestParam("tag") String tag) {
		String[] str = tag.split("\\,",-1);
		//
		List<Tag> T = new ArrayList<Tag>();
		for(String s : str) {
			service.create(new Tag(s));
			T.add(new Tag(s));
		}
		Question q = new Question(question, T);
		service.create(q);
		return "redirect:/questions/new";
	}
}