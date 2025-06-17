package fr.dawan.quiz.controllers;

import fr.dawan.quiz.services.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public abstract class GenericController<TDto> {

    private final GenericService<TDto> service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TDto> getAll(Pageable page) {
        return service.getAll(page).getContent();
    }

    @GetMapping(value = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public TDto getById(@PathVariable long id) {
        return service.getById(id);
    }

    @DeleteMapping(value = "/{id:[0-9]+}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String deleteById(@PathVariable long id) {
        service.deleteById(id);
        return Long.toString(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public TDto create(@RequestBody TDto marque) {
        return service.create(marque);
    }

    @PutMapping(value = "/{id:[0-9]+}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public TDto update(@RequestBody TDto marque, @PathVariable long id) {
        return service.update(marque, id);
    }

}