package fr.dawan.quiz.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter

@Builder
public class CategorieDto {

    private final long id;

    private final String nom;

    private final String description;

}
