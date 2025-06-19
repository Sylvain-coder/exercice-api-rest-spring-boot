package fr.dawan.quiz.controllers;

import fr.dawan.quiz.dtos.QcmDto;
import fr.dawan.quiz.services.QcmService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/qcms")
public class QcmController extends GenericController<QcmDto> {

    private final QcmService service;

    public QcmController(QcmService service) {
        super(service);
        this.service = service;
    }

    @GetMapping(value = "/categorie/{nom}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<QcmDto> getByCategorieNom(@PathVariable String nom, Pageable page) {
        return service.getByCategorieNom(nom, page);
    }

    @GetMapping(value = "/user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<QcmDto> getByUserId(@PathVariable long userId, Pageable page) {
        return service.getByUserId(userId, page);
    }

}
