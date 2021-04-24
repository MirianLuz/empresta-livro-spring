package com.devsjavagirl.emprestalivro.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro {

    @Id
    @GeneratedValue
    private Long codigo;

    private String nome;

    private String autor;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
