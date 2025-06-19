package fr.dawan.quiz.controllers;

import fr.dawan.quiz.dtos.ReponseDto;
import fr.dawan.quiz.services.ReponseService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/reponses")
public class ReponseController extends GenericController<ReponseDto> {

    private final ReponseService service;

    public ReponseController(ReponseService service) {
        super(service);
        this.service = service;
    }

    @GetMapping(value = "/question/{idQuestion}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReponseDto> getByQuestionId(@PathVariable long idQuestion) {
        return service.getByQuestionId(idQuestion);
    }

}
