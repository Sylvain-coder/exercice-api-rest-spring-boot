package fr.dawan.quiz.services;

import fr.dawan.quiz.dtos.QcmDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface QcmService extends GenericService<QcmDto> {

    List<QcmDto> getByCategorieNom(String nom, Pageable page);

    List<QcmDto> getByUserId(long userId, Pageable page);
}
