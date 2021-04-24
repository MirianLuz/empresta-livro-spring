package com.devsjavagirl.emprestalivro.dominio;

import javax.persistence.*;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue
    private Long codigo;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Livro livro;

    @Deprecated
    public Emprestimo() {
    }

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
    }

}
