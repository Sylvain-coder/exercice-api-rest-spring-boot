package fr.dawan.quiz.services;

import fr.dawan.quiz.dtos.ReponseDto;

import java.util.List;

public interface ReponseService extends GenericService<ReponseDto> {

    List<ReponseDto> getByQuestionId(long questionId);
}
