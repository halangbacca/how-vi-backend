package com.univali.how_v.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@IdClass(MatriculaId.class)
public class Matricula {
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "aluno_fk", nullable = false)
    private Aluno aluno;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "disciplina_fk", nullable = false)
    private Disciplina disciplina;
}
