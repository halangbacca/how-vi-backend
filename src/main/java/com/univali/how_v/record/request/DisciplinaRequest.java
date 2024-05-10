package com.univali.how_v.record.request;

import jakarta.validation.constraints.NotNull;

public record DisciplinaRequest(
        @NotNull
        String nome,
        @NotNull
        String descricao,
        @NotNull
        Integer cargaHoraria) {
}
