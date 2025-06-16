package fr.dawan.quiz.mappers;

import fr.dawan.quiz.dtos.QuestionDto;
import fr.dawan.quiz.entities.Question;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface QuestionMapper extends GenericMapper<Question, QuestionDto> {

}
