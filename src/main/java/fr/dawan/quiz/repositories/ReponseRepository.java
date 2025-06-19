package fr.dawan.quiz.repositories;

import fr.dawan.quiz.entities.Reponse;

import java.util.List;

public interface ReponseRepository extends GenericRepository<Reponse> {

    List<Reponse> findByQuestionId(long idQuestion);

}
