package fr.dawan.quiz.dtos;

import fr.dawan.quiz.enums.Niveau;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter

@Builder
public class QuestionDto {

    private final long id;

    private final String intitule;

    private final Niveau niveau;

    private final String explication;

}
