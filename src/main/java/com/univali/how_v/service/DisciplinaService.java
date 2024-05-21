package com.univali.how_v.service;

import com.univali.how_v.model.Disciplina;
import com.univali.how_v.repository.DisciplinaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {
    private final DisciplinaRepository repository;

    public DisciplinaService(DisciplinaRepository repository) {
        this.repository = repository;
    }

    public Disciplina cadastrarDisciplina(Disciplina request) {
        return repository.save(request);
    }

    public Disciplina atualizarDisciplina(Long id, Disciplina request) {
        if (this.repository.existsById(id)) {
            request.setId(id);
            return this.repository.save(request);
        }
        throw new EntityNotFoundException("Disciplina não encontrada!");
    }

    public List<Disciplina> listarDisciplinas() {
        return repository.findAll();

    }

    public Disciplina buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Disciplina não encontrada!"));
    }

    public void deletarPorId(Long id) {
        repository.findById(id)
                .map(disciplina -> {
                    repository.deleteById(id);
                    return disciplina;
                })
                .orElseThrow(() -> new EntityNotFoundException("Disciplina não encontrada!"));
    }
}
