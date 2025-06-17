package fr.dawan.quiz.controllers;

import fr.dawan.quiz.dtos.CategorieDto;
import fr.dawan.quiz.services.CategorieService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategorieController extends GenericController<CategorieDto> {

    private final CategorieService service;

    public CategorieController(CategorieService service) {
        super(service);
        this.service = service;
    }

    @GetMapping(value = "/parent/{idParent}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategorieDto> getByParentId(@PathVariable long idParent, Pageable page) {
        return service.getByParentId(idParent, page);
    }

    @GetMapping(value = "/{nom:^[a-zA-Z][ a-zA-Z0-9]+$}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategorieDto> getByNom(@PathVariable String nom) {
        return service.getByNom(nom);
    }

}
