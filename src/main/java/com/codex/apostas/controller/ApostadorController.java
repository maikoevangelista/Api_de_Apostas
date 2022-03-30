package com.codex.apostas.controller;

import com.codex.apostas.model.Apostador;
import com.codex.apostas.model.dto.ApostadorIn;
import com.codex.apostas.repository.ApostadorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class ApostadorController {

    private final ApostadorRepository apostadorRepository;

    public ApostadorController(ApostadorRepository apostadorRepository) {
        this.apostadorRepository = apostadorRepository;
    }

    @PostMapping("/apostador")
    public ResponseEntity salvarApostador(@RequestBody ApostadorIn apostadorIn) {
        Apostador apostador = apostadorIn.toConvert();
        apostadorRepository.save(apostador);

        return ResponseEntity.status(CREATED).build();
    }
}
