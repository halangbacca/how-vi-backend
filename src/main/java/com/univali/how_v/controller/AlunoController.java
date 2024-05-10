package com.univali.how_v.controller;

import com.univali.how_v.mapper.AlunoMapper;
import com.univali.how_v.model.Aluno;
import com.univali.how_v.record.request.AlunoRequest;
import com.univali.how_v.record.response.AlunoResponse;
import com.univali.how_v.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/aluno")
public class AlunoController {
    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<AlunoResponse>> findAll() {
        List<AlunoResponse> alunoResponse = service.listarAlunos()
                .stream()
                .map(AlunoMapper.INSTANCE::alunoToResponse).toList();

        return ResponseEntity.status(HttpStatus.OK)
                .body(alunoResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoResponse> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(AlunoMapper.INSTANCE.alunoToResponse(service.buscarPorId(id)));
    }

    @PostMapping()
    public ResponseEntity<Object> save(@RequestBody @Valid AlunoRequest request) {
        Aluno aluno = AlunoMapper.INSTANCE.requestToAluno(request);
        return ResponseEntity.ok(service.cadastrarAluno(aluno));
    }
}
