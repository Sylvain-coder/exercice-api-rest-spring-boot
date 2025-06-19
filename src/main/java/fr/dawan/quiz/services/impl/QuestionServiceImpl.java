package fr.dawan.quiz.services.impl;

import fr.dawan.quiz.dtos.QuestionDto;
import fr.dawan.quiz.entities.Question;
import fr.dawan.quiz.mappers.QuestionMapper;
import fr.dawan.quiz.repositories.QuestionRepository;
import fr.dawan.quiz.services.QuestionService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class QuestionServiceImpl extends GenericServiceImpl<Question, QuestionDto> implements QuestionService {

    private final QuestionRepository repository;

    private final QuestionMapper mapper;

    public QuestionServiceImpl(QuestionRepository repository, QuestionMapper mapper) {
        super(repository, mapper);
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<QuestionDto> getByQcmId(long quizId, Pageable page) {
        return repository.findByQcmId(quizId, page).stream().map(mapper::toDto).collect(Collectors.toList());
    }

}
