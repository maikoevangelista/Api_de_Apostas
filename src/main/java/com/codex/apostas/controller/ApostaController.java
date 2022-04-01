package com.codex.apostas.controller;

import com.codex.apostas.model.dto.ApostaIn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class ApostaController {

    @PostMapping("/apostas")
    public ResponseEntity salvarAposta(@RequestBody ApostaIn apostaIn){

        return ResponseEntity.status(CREATED).build();
    }
}
