package fr.dawan.quiz.services.impl;

import fr.dawan.quiz.entities.BaseEntity;
import fr.dawan.quiz.exceptions.IdNotFoundException;
import fr.dawan.quiz.mappers.GenericMapper;
import fr.dawan.quiz.repositories.GenericRepository;
import fr.dawan.quiz.services.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class GenericServiceImpl<T extends BaseEntity, TDto> implements GenericService<TDto> {

    private final GenericRepository<T> repository;

    private final GenericMapper<T,TDto> mapper;

    @Transactional(readOnly = true)
    @Override
    public Page<TDto> getAll(Pageable page) {
        return repository.findAll(page).map(mapper::toDto);
    }

    @Transactional(readOnly = true)
    @Override
    public TDto getById(long id) {
        T entity = repository.findById(id).orElseThrow(IdNotFoundException::new);
        return mapper.toDto(entity);
    }

    @Override
    public boolean isExistId(long id) {
        return repository.existsById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void deleteById(long id) {
        if (repository.removeById(id) == 0) {
            throw new IdNotFoundException();
        }
    }

    @Override
    public TDto create(TDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public TDto update(TDto dto, long id) {
        T entity = repository.findById(id).orElseThrow(IdNotFoundException::new);
        mapper.update(dto, entity);
        return mapper.toDto(repository.save(entity));
    }
}
