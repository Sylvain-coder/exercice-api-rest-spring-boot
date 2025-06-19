package fr.dawan.quiz.mappers;

import fr.dawan.quiz.dtos.CategorieDto;
import fr.dawan.quiz.entities.Categorie;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CategorieMapper extends GenericMapper<Categorie, CategorieDto> {

}
