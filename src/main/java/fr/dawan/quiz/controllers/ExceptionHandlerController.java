package fr.dawan.quiz.controllers;

import fr.dawan.quiz.dtos.ApiErrorDto;
import fr.dawan.quiz.exceptions.EmailNotFoundException;
import fr.dawan.quiz.exceptions.IdNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<?> handleIdNotFoundException(IdNotFoundException ex, WebRequest request) {
        ApiErrorDto err = new ApiErrorDto(HttpStatus.NOT_FOUND, "L'id n'existe pas");
        return handleExceptionInternal(ex, err, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(EmailNotFoundException.class)
    public ResponseEntity<?> handleEmailNotFoundException(EmailNotFoundException ex, WebRequest request) {
        ApiErrorDto err = new ApiErrorDto(HttpStatus.NOT_FOUND, ex.getMessage());
        return handleExceptionInternal(ex, err, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers,
                                                                  HttpStatusCode status, WebRequest request) {
        StringBuilder msgErr = new StringBuilder();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            msgErr.append(((FieldError) error).getField());
            msgErr.append(" : ");
            msgErr.append(error.getDefaultMessage());
        });
        ApiErrorDto err = new ApiErrorDto(HttpStatus.BAD_REQUEST, msgErr.toString());
        return handleExceptionInternal(ex, err, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
