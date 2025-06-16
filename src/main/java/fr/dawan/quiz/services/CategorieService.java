package fr.dawan.quiz.services;

import fr.dawan.quiz.dtos.CategorieDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategorieService extends GenericService<CategorieDto> {

    List<CategorieDto> getByParentId(long id, Pageable page);

    List<CategorieDto> getByNom(String nom);
}
