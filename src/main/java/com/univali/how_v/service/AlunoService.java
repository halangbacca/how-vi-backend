package com.univali.how_v.service;

import com.univali.how_v.model.Aluno;
import com.univali.how_v.repository.AlunoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public Aluno cadastrarAluno(Aluno request) {
        return repository.save(request);
    }

    public Aluno atualizarAluno(Long id, Aluno request) {

        if (this.repository.existsById(id)) {
            request.setId(id);
            return this.repository.save(request);
        }
        throw new EntityNotFoundException("Aluno não encontrado!");
    }

    public List<Aluno> listarAlunos() {
        return repository.findAll();

    }

    public Aluno buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado!"));
    }

    public void deletarPorId(Long id) {
        repository.findById(id)
                .map(aluno -> {
                    repository.deleteById(id);
                    return aluno;
                })
                .orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado!"));
    }
}
