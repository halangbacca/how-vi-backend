package com.univali.how_v.record.response;

import java.util.List;

public record DisciplinaResponse(
        Long id,
        String nome,
        String descricao,
        Integer cargaHoraria,
        List<AlunoResponse> alunos
) {
}
