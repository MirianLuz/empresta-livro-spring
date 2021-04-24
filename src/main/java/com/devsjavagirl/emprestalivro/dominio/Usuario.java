package com.devsjavagirl.emprestalivro.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long codigo;

    private String nomeCompleto;

    private String dataNascimento;

    private String endereco;

    public Usuario(String nomeCompleto, String dataNascimento, String endereco) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codigo=" + codigo +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
