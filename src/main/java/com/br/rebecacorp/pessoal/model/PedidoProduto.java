package com.br.rebecacorp.pessoal.model;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class PedidoProduto {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedidos pedido;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produtos produto;
}
