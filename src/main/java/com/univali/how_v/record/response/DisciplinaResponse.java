package com.univali.how_v.record.response;

public record DisciplinaResponse(
        Long id,
        String nome,
        String descricao,
        Integer cargaHoraria,
        AlunoResponse aluno
) {
}
