package fr.dawan.quiz.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter

@Builder
public class ApiErrorDto {

    private HttpStatus status;

    private String message;

    private final LocalDateTime date = LocalDateTime.now();

}
