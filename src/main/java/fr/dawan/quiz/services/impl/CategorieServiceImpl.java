package fr.dawan.quiz.services.impl;

import fr.dawan.quiz.dtos.CategorieDto;
import fr.dawan.quiz.entities.Categorie;
import fr.dawan.quiz.mappers.CategorieMapper;
import fr.dawan.quiz.repositories.CategorieRepository;
import fr.dawan.quiz.services.CategorieService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CategorieServiceImpl extends GenericServiceImpl<Categorie, CategorieDto> implements CategorieService {

    private final CategorieRepository repository;

    private final CategorieMapper mapper;

    public CategorieServiceImpl(CategorieRepository repository, CategorieMapper mapper) {
        super(repository, mapper);
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<CategorieDto> getByParentId(long id, Pageable page) {
        return repository.findByParentId(id, page).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Override
    public List<CategorieDto> getByNom(String nom) {
        return repository.findByNom(nom).stream().map(mapper::toDto).collect(Collectors.toList());
    }

}
