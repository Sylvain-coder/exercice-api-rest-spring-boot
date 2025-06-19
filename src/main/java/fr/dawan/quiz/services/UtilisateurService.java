package fr.dawan.quiz.services;

import fr.dawan.quiz.dtos.UtilisateurDto;

public interface UtilisateurService extends GenericService<UtilisateurDto> {

    UtilisateurDto getByEmail(String email);

}
