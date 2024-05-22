package com.univali.how_v.mapper;

import com.univali.how_v.model.Matricula;
import com.univali.how_v.record.response.MatriculaResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MatriculaMapper {
    MatriculaMapper INSTANCE = Mappers.getMapper(MatriculaMapper.class);

    MatriculaResponse matriculaToResponse(Matricula matricula);
}
