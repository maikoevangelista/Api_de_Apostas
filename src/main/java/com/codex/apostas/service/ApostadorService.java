package com.codex.apostas.service;

import com.codex.apostas.model.Apostador;
import com.codex.apostas.model.dto.ApostadorIn;
import com.codex.apostas.repository.ApostadorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ApostadorService {

    private final ApostadorRepository apostadorRepository;
    private final ModelMapper modelMapper;

    public void salvarApostador(ApostadorIn apostadorIn){
        Apostador apostador = modelMapper.map(apostadorIn, Apostador.class);
        apostadorRepository.save(apostador);

    }
}
