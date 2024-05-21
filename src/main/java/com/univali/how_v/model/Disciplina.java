package com.univali.how_v.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

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
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "disciplinas_alunos",
            joinColumns = @JoinColumn(name = "disciplina_fk"),
            inverseJoinColumns = @JoinColumn(name = "aluno_fk"))
    private Set<Aluno> alunos;
}
