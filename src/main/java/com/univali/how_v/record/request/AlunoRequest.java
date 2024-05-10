package com.univali.how_v.record.request;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record AlunoRequest(
        @NotNull
        String nome,
        @NotNull
        LocalDate dataNascimento,
        @NotNull
        @CPF
        String cpf) {
}
