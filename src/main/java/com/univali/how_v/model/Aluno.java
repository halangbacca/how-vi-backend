package com.univali.how_v.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    private String cpf;
    @ManyToMany(mappedBy = "alunos", fetch = FetchType.LAZY)
    private Set<Disciplina> disciplinas;
}
