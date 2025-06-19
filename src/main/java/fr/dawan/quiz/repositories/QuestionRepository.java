package fr.dawan.quiz.repositories;

import fr.dawan.quiz.entities.Question;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface QuestionRepository extends GenericRepository<Question> {

    List<Question> findByQcmId(long idQcm, Pageable page);

}
