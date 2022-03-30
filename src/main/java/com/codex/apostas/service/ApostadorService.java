package com.codex.apostas.service;

import com.codex.apostas.model.dto.ApostadorIn;
import com.codex.apostas.repository.ApostadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ApostadorService {

    private final ApostadorRepository apostadorRepository;

    public void salvarApostador(ApostadorIn apostadorIn){
        apostadorRepository.save();

    }
}
