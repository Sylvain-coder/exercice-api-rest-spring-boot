package fr.dawan.quiz.controllers;

import fr.dawan.quiz.dtos.QuestionDto;
import fr.dawan.quiz.services.QuestionService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController extends GenericController<QuestionDto> {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        super(service);
        this.service = service;
    }

    @GetMapping(value = "/qcm/{qcmId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<QuestionDto> getByQcmId(@PathVariable long qcmId, Pageable page) {
        return service.getByQcmId(qcmId, page);
    }

}
