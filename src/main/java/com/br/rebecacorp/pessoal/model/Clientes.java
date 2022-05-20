package com.br.rebecacorp.pessoal.model;

import javax.persistence.*;


@Entity
@Table(name = "clientes")
public class Clientes {
    
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String nome;

    public Clientes(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
