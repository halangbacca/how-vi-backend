package com.univali.how_v.service;

import com.univali.how_v.model.Matricula;
import com.univali.how_v.record.request.MatriculaRequest;
import com.univali.how_v.repository.AlunoRepository;
import com.univali.how_v.repository.DisciplinaRepository;
import com.univali.how_v.repository.MatriculaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {
    private final AlunoRepository alunoRepository;
    private final DisciplinaRepository disciplinaRepository;
    private final MatriculaRepository matriculaRepository;

    public MatriculaService(MatriculaRepository matriculaRepository, AlunoRepository alunoRepository, DisciplinaRepository disciplinaRepository) {
        this.matriculaRepository = matriculaRepository;
        this.alunoRepository = alunoRepository;
        this.disciplinaRepository = disciplinaRepository;
    }

    public List<Matricula> listarMatriculas() {
        return matriculaRepository.findAll();
    }

    public Matricula efetuarMatricula(MatriculaRequest request) {
        if (this.alunoRepository.existsById(request.alunoFk())) {
            var aluno = alunoRepository.findById(request.alunoFk()).get();
            if (this.disciplinaRepository.existsById(request.disciplinaFk())) {
                var disciplina = disciplinaRepository.findById(request.disciplinaFk()).get();
                var matricula = new Matricula();
                matricula.setAluno(aluno);
                matricula.setDisciplina(disciplina);

                return matriculaRepository.save(matricula);
            }
        }
        throw new EntityNotFoundException("Matrícula não efetuada!");
    }
}