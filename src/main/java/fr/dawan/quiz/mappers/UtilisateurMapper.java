package fr.dawan.quiz.mappers;

import fr.dawan.quiz.dtos.UtilisateurDto;
import fr.dawan.quiz.entities.Utilisateur;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface UtilisateurMapper extends GenericMapper<Utilisateur, UtilisateurDto> {

}
