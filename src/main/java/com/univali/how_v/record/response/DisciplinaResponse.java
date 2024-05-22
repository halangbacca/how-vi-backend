package com.univali.how_v.record.response;

import com.univali.how_v.model.Aluno;

import java.util.List;

public record DisciplinaResponse(
        Long id,
        String nome,
        String descricao,
        Integer cargaHoraria,
        List<Aluno> alunos
) {
}
