package fr.dawan.quiz.services.impl;

import fr.dawan.quiz.dtos.ReponseDto;
import fr.dawan.quiz.entities.Reponse;
import fr.dawan.quiz.mappers.ReponseMapper;
import fr.dawan.quiz.repositories.ReponseRepository;
import fr.dawan.quiz.services.ReponseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ReponseServiceImpl extends GenericServiceImpl<Reponse, ReponseDto> implements ReponseService {

    private final ReponseRepository repository;

    private final ReponseMapper mapper;

    public ReponseServiceImpl(ReponseRepository repository, ReponseMapper mapper) {
        super(repository, mapper);
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<ReponseDto> getByQuestionId(long idQuestion) {
        return repository.findByQuestionId(idQuestion).stream().map(mapper::toDto).collect(Collectors.toList());
    }

}
