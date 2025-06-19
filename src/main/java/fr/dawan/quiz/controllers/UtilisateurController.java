package fr.dawan.quiz.controllers;

import fr.dawan.quiz.dtos.UtilisateurDto;
import fr.dawan.quiz.services.UtilisateurService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController extends GenericController<UtilisateurDto> {

    private final UtilisateurService service;

    public UtilisateurController(UtilisateurService service) {
        super(service);
        this.service = service;
    }

    @GetMapping(value = "/{email:^[a-zA-Z][a-zA-Z0-9._+-@]+$}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UtilisateurDto getByEmail(@PathVariable String email) {
        return service.getByEmail(email);
    }
}
