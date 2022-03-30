package com.codex.apostas.model.dto;

import com.codex.apostas.model.Apostador;
import lombok.Getter;

@Getter
public class ApostadorIn {

    private String nome;
    private String Email;

    public Apostador toConvert(){ return new Apostador(null, nome, Email);}
}
