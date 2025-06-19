package fr.dawan.quiz.dtos;

import fr.dawan.quiz.enums.Niveau;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter

@Builder
public class QuestionDto {

    @PositiveOrZero
    private final long id;

    @NotBlank
    @Size(min = 8, max = 350)
    private final String intitule;

    private final Niveau niveau;

    @Size(max = 300)
    private final String explication;

}
