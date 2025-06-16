package fr.dawan.quiz.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter

@Builder
public class QcmDto {

    private final long id;

    private final String nom;

    private final String description;

    private final int tempsTotal;

    private final LocalDateTime creation;


}
