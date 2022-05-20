package com.br.rebecacorp.pessoal.model;

import javax.persistence.*;

@Entity
@Table(name = "produtos")
public class Produtos {
    
    @Column(name = "id")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

}
