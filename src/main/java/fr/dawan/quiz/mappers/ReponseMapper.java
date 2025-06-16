package fr.dawan.quiz.mappers;

import fr.dawan.quiz.dtos.ReponseDto;
import fr.dawan.quiz.entities.Reponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ReponseMapper extends GenericMapper<Reponse, ReponseDto> {

}
