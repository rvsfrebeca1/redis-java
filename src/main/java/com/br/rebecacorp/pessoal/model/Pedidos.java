package com.br.rebecacorp.pessoal.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Column(name = "id")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "data")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Clientes cliente;

    public Pedidos(Integer id, LocalDate data, Clientes idCliente) {
        this.id = id;
        this.data = data;
        this.cliente = idCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Clientes getIdCliente() {
        return cliente;
    }

    public void setIdCliente(Clientes cliente) {
        this.cliente = cliente;
    }
}
