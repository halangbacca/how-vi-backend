package com.univali.how_v.controller;

import com.univali.how_v.mapper.MatriculaMapper;
import com.univali.how_v.record.request.MatriculaRequest;
import com.univali.how_v.record.response.MatriculaResponse;
import com.univali.how_v.service.MatriculaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/matricula")
public class MatriculaController {
    private final MatriculaService service;

    public MatriculaController(MatriculaService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<MatriculaResponse>> findAll() {
        List<MatriculaResponse> matriculaResponse = service.listarMatriculas()
                .stream()
                .map(MatriculaMapper.INSTANCE::matriculaToResponse).toList();

        return ResponseEntity.status(HttpStatus.OK)
                .body(matriculaResponse);
    }

    @PostMapping()
    public ResponseEntity<Object> efetuarMatricula(@RequestBody @Valid MatriculaRequest request) {
        return ResponseEntity.ok(service.efetuarMatricula(request));
    }
}
