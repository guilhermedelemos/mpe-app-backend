package io.github.mpeapp.model;

import javax.persistence.*;

@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String sigla;

    public Pais() {
        super();
    }

    public Pais(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
