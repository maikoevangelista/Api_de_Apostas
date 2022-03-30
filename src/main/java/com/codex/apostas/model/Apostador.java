package com.codex.apostas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Entity
@NoArgsConstructor
public class Apostador {

     @Id @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
     private String nome;
     private String email;

     public Apostador(Long aLong, String nome, String email) {
     }
}
