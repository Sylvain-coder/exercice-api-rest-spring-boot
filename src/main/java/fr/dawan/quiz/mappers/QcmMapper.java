package fr.dawan.quiz.mappers;

import fr.dawan.quiz.dtos.QcmDto;
import fr.dawan.quiz.entities.Qcm;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface QcmMapper extends GenericMapper<Qcm, QcmDto> {

}
