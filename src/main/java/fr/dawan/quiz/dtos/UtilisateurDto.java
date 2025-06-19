package fr.dawan.quiz.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter

@Builder
public class UtilisateurDto {

    @PositiveOrZero
    private final long id;

    @NotBlank
    @Size(max = 60)
    private final String nom;

    @NotBlank
    @Size(max = 60)
    private final String prenom;

    @NotBlank
    @Email
    private final String email;

}
