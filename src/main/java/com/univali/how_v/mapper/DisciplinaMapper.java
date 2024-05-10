package com.univali.how_v.mapper;

import com.univali.how_v.model.Disciplina;
import com.univali.how_v.record.request.DisciplinaRequest;
import com.univali.how_v.record.response.DisciplinaResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DisciplinaMapper {
    DisciplinaMapper INSTANCE = Mappers.getMapper(DisciplinaMapper.class);

    Disciplina requestToDisciplina(DisciplinaRequest request);

    DisciplinaResponse disciplinaToResponse(Disciplina disciplina);
}
