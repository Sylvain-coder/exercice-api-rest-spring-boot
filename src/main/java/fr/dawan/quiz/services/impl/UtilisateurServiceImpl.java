package fr.dawan.quiz.services.impl;

import fr.dawan.quiz.dtos.UtilisateurDto;
import fr.dawan.quiz.entities.Utilisateur;
import fr.dawan.quiz.exceptions.EmailNotFoundException;
import fr.dawan.quiz.mappers.UtilisateurMapper;
import fr.dawan.quiz.repositories.UtilisateurRepository;
import fr.dawan.quiz.services.UtilisateurService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UtilisateurServiceImpl extends GenericServiceImpl<Utilisateur, UtilisateurDto> implements UtilisateurService {

    private final UtilisateurRepository repository;

    private final UtilisateurMapper mapper;


    public UtilisateurServiceImpl(UtilisateurRepository repository, UtilisateurMapper mapper) {
        super(repository, mapper);
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public UtilisateurDto getByEmail(String email) {
        return repository.findByEmail(email).map(mapper::toDto).orElseThrow(() -> new EmailNotFoundException("L'email : " + email + " n'existe pas"));
    }

}
