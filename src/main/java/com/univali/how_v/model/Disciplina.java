package com.univali.how_v.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    @Column(name = "carga_horaria")
    private Integer cargaHoraria;
    @ManyToOne
    private Aluno aluno;
}
