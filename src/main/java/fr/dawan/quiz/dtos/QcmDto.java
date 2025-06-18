package fr.dawan.quiz.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter

@Builder
public class QcmDto {

    @PositiveOrZero
    private final long id;

    @NotBlank
    @Size(max = 100)
    private final String nom;

    @Size(max = 255)
    private final String description;

    @PositiveOrZero
    private final int tempsTotal;

    @PastOrPresent
    private final LocalDateTime creation;


}
