package com.codex.apostas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apostador {

     @Id @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
     private String nome;
     private String email;

     public Apostador(String nome, String email) {
          this.nome = nome;
          this.email = email;
     }

     public String getNome() {
          return nome;
     }

     public String getEmail() {
          return email;
     }
}
