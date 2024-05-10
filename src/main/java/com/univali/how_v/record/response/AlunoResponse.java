package com.univali.how_v.record.response;

import java.time.LocalDate;
import java.util.List;

public record AlunoResponse(
        Long id,
        String nome,
        LocalDate dataNascimento,
        String cpf,
        List<DisciplinaResponse> disciplinas) {
}
