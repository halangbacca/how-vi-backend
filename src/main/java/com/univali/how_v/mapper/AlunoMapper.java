package com.univali.how_v.mapper;

import com.univali.how_v.model.Aluno;
import com.univali.how_v.record.request.AlunoRequest;
import com.univali.how_v.record.response.AlunoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AlunoMapper {
    AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);

    Aluno requestToAluno(AlunoRequest request);

    AlunoResponse alunoToResponse(Aluno aluno);
}
