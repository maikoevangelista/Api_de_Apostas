package com.codex.apostas.model.dto;

import com.codex.apostas.model.Apostador;

public class ApostadorIn {

    private String nome;
    private String Email;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return Email;
    }
    public Apostador toConvert(){
        return new Apostador(nome, Email);
    }
}
