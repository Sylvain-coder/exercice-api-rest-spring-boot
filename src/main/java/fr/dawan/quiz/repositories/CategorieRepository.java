package fr.dawan.quiz.repositories;

import fr.dawan.quiz.entities.Categorie;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategorieRepository extends GenericRepository<Categorie> {

    List<Categorie> findByParentId(long idParent, Pageable pageable);

    List<Categorie> findByNom(String nom);

}
