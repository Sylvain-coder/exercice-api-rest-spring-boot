package fr.dawan.quiz.services;

import fr.dawan.quiz.dtos.QuestionDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface QuestionService extends GenericService<QuestionDto> {

    List<QuestionDto> getByQcmId(long quizId, Pageable page);
}
