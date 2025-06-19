package fr.dawan.quiz.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GenericService<TDto> {

    Page<TDto> getAll(Pageable page);

    TDto getById(long id);

    boolean isExistId(long id);

    long count();

    void deleteById(long id);

    TDto create(TDto dto);

    TDto update(TDto dto, long id);

}
