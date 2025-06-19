package fr.dawan.quiz.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter

@Builder
public class ReponseDto {

    @PositiveOrZero
    private final long id;

    @NotBlank
    @Size(max = 255)
    private final String texte;

    @NotNull
    private final boolean correct;

}
