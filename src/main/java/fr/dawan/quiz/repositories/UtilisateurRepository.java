package fr.dawan.quiz.repositories;

import fr.dawan.quiz.entities.Utilisateur;

import java.util.Optional;

public interface UtilisateurRepository extends GenericRepository<Utilisateur> {

    Optional<Utilisateur> findByEmail(String email);

}
