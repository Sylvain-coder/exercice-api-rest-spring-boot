package fr.dawan.quiz.repositories;

import fr.dawan.quiz.entities.Qcm;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface QcmRepository extends GenericRepository<Qcm> {

    List<Qcm> findByCategorieNom(String nom, Pageable pageable);

    List<Qcm> findByUtilisateurId(long userId, Pageable pageable);

}
