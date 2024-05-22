package com.univali.how_v.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class MatriculaId implements Serializable {
    private Aluno aluno;
    private Disciplina disciplina;
}
