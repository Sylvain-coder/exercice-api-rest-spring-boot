package fr.dawan.quiz.services.impl;

import fr.dawan.quiz.dtos.QcmDto;
import fr.dawan.quiz.entities.Qcm;
import fr.dawan.quiz.mappers.QcmMapper;
import fr.dawan.quiz.repositories.QcmRepository;
import fr.dawan.quiz.services.QcmService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class QcmServiceImpl extends GenericServiceImpl<Qcm, QcmDto> implements QcmService {

    private final QcmRepository repository;

    private final QcmMapper mapper;

    public QcmServiceImpl(QcmRepository repository, QcmMapper mapper) {
        super(repository, mapper);
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<QcmDto> getByCategorieNom(String nom, Pageable page) {
        return repository.findByCategorieNom(nom, page).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Override
    public List<QcmDto> getByUserId(long userId, Pageable page) {
        return repository.findByUtilisateurId(userId, page).stream().map(mapper::toDto).collect(Collectors.toList());
    }

}
