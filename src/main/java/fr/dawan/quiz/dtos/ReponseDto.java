package fr.dawan.quiz.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter

@Builder
public class ReponseDto {

    private final long id;

    private final String texte;

    private final boolean correct;

}
