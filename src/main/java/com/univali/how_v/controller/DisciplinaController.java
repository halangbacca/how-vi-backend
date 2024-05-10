package com.univali.how_v.controller;

import com.univali.how_v.mapper.DisciplinaMapper;
import com.univali.how_v.model.Disciplina;
import com.univali.how_v.record.request.DisciplinaRequest;
import com.univali.how_v.record.response.DisciplinaResponse;
import com.univali.how_v.service.DisciplinaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/disciplina")
public class DisciplinaController {
    private final DisciplinaService service;

    public DisciplinaController(DisciplinaService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<DisciplinaResponse>> findAll() {
        List<DisciplinaResponse> disciplinaResponse = service.listarDisciplinas()
                .stream()
                .map(DisciplinaMapper.INSTANCE::disciplinaToResponse).toList();

        return ResponseEntity.status(HttpStatus.OK)
                .body(disciplinaResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisciplinaResponse> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(DisciplinaMapper.INSTANCE.disciplinaToResponse(service.buscarPorId(id)));
    }

    @PostMapping()
    public ResponseEntity<Object> save(@RequestBody @Valid DisciplinaRequest request) {
        Disciplina disciplina = DisciplinaMapper.INSTANCE.requestToDisciplina(request);
        return ResponseEntity.ok(service.cadastrarDisciplina(disciplina));
    }
}
